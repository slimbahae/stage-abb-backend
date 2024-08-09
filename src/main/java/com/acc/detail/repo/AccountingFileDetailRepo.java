package com.acc.detail.repo;

import com.acc.detail.dto.AccountFileResultDTO;
import com.acc.detail.dto.OperationDTO;
import com.acc.detail.dto.OperationResultDTO;
import com.acc.detail.entity.AccountFileDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface AccountingFileDetailRepo extends JpaRepository<AccountFileDetail, Long> {

    @Query("SELECT new com.acc.detail.dto.OperationDTO(af.businessDate, CASE WHEN afd.codeReseau IS NULL THEN NULL ELSE nr.networkLabel END, CASE WHEN afd.activiteCode IS NULL THEN NULL ELSE aaf.activiteLabel END, COUNT(afd) / 2, SUM(afd.montantSource), afd.idFichier ) " +
            "FROM AccountFileDetail afd " +
            "JOIN AccountingFile af ON afd.idFichier = af.idFichier " +
            "LEFT JOIN AccountFileNetwork nr ON afd.codeReseau = nr.networkCode " +
            "LEFT JOIN AccountFileActivite aaf ON afd.activiteCode = aaf.activiteCode " +
            "LEFT JOIN AccountMotRejet amr ON af.codeMotRejet = amr.codeMotRejet " +
            "WHERE (:startDate IS NULL OR af.businessDate >= :startDate) " +
            "AND (:endDate IS NULL OR af.businessDate <= :endDate) " +
            "AND (:statusFichier IS NULL OR af.statutFichier = :statusFichier) " +
            "AND (:networkLabel IS NULL OR nr.networkLabel = :networkLabel) " +
            "AND (:activiteLabel IS NULL OR aaf.activiteLabel = :activiteLabel) " +
            "AND (af.statutFichier IN ('R', 'V', 'I')) " +
            "AND (af.statutFichier != 'R' OR amr.typeRejet = 'F') " +
            "GROUP BY af.idFichier")
    List<OperationDTO> findOperationsByFileIdAndFilters(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate, @Param("statusFichier") String statusFichier, @Param("networkLabel") String networkLabel, @Param("activiteLabel") String activiteLabel);

    @Query("SELECT new com.acc.detail.dto.AccountFileResultDTO(af, amr) " +
            "FROM AccountingFile af " +
            "JOIN AccountMotRejet amr ON af.codeMotRejet = amr.codeMotRejet " +
            "WHERE af.statutFichier = 'R' AND amr.typeRejet = 'T'" +
            "AND (:startDate IS NULL OR af.businessDate >= :startDate) AND (:endDate IS NULL OR af.businessDate <= :endDate)")
    List<AccountFileResultDTO> findAccountFilesWithStatusRAndTypeRejetT(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);

    @Query("SELECT afd, af FROM AccountFileDetail afd " + "JOIN AccountingFile af ON afd.idFichier = af.idFichier " + "WHERE afd.idFichier = :idFichier")
    List<AccountFileDetail> findAccountFileDetailsWithAccountFiles(@Param("idFichier") Long idFichier);

    @Query("SELECT new com.acc.detail.dto.OperationResultDTO(of.dateOper, " +
            "afd.codeArn, " +
            "nr.networkLabel, " +
            "aaf.activiteLabel, " +
            "of.codTypop, " +
            "COALESCE(of.cpteDebi, afd.ribCompte), " +
            "COALESCE(of.cpteCred, afd.ribCompte), " +
            "of.montOper, " +
            "COALESCE(of.codStaop, afd.statutLigne), " +
            "(COALESCE(of.taxeOper, 0) + COALESCE(of.taxeTele, 0))) " +
            "FROM AccountFileDetail afd " +
            "INNER JOIN OperFinanciere of ON afd.codeArn = of.refeOper " +
            "LEFT JOIN AccountFileActivite aaf ON afd.activiteCode = aaf.activiteCode " +
            "LEFT JOIN AccountFileNetwork nr ON afd.codeReseau = nr.networkCode " +
            "WHERE afd.idFichier = :fileId AND afd.codeArn = of.refeOper " +
            "GROUP BY of.refeOper")
    List<OperationResultDTO> findDetailedOperations(@Param("fileId") Long fileId);




}
