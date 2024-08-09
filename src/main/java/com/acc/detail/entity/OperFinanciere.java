package com.acc.detail.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "oper_financiere")
public class OperFinanciere {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dateoper")
    private LocalDate dateOper;

    @Column(name = "codburpo", nullable = false)
    private BigDecimal codBurpo;

    @Column(name = "numordof", nullable = false)
    private BigDecimal numOrdof;

    @Column(name = "codtypop")
    private String codTypop;

    @Column(name = "dateeffe")
    private LocalDate dateEffe;

    @Column(name = "datetitr")
    private LocalDate dateTitr;

    @Column(name = "datevale")
    private LocalDate dateVale;

    @Column(name = "commenta", length = 60)
    private String commenta;

    @Column(name = "reftitju", length = 30)
    private String reftitju;

    @Column(name = "codeorga")
    private BigDecimal codeOrga;

    @Column(name = "numautav")
    private Short numAutav;

    @Column(name = "cptedebi")
    private String cpteDebi;

    @Column(name = "cptecred")
    private String cpteCred;

    @Column(name = "typepiec", length = 1)
    private String typePiec;

    @Column(name = "numpieid", length = 15)
    private String numPieid;

    @Column(name = "datpieid")
    private LocalDate datPieid;

    @Column(name = "nom_tire", length = 30)
    private String nomTire;

    @Column(name = "nom_expe", length = 30)
    private String nomExpe;

    @Column(name = "villexpe", length = 30)
    private String villeExpe;

    @Column(name = "nombtitr")
    private Short nombTitr;

    @Column(name = "nbrrepfo")
    private BigDecimal nbrRepfo;

    @Column(name = "dafirefo")
    private LocalDate dafiRefo;

    @Column(name = "montoper")
    private BigDecimal montOper;

    @Column(name = "taxeoper")
    private BigDecimal taxeOper;

    @Column(name = "taxetele")
    private BigDecimal taxeTele;

    @Column(name = "debooper")
    private BigDecimal deboOper;

    @Column(name = "numeemis")
    private Integer numEemis;

    @Column(name = "codbpemi")
    private BigDecimal codBpemi;

    @Column(name = "desbpemi", length = 60)
    private String desBpemi;

    @Column(name = "dateemis")
    private LocalDate dateEmis;

    @Column(name = "codbppai")
    private BigDecimal codBppai;

    @Column(name = "numepaie")
    private Integer numEpaie;

    @Column(name = "numeauto")
    private Short numeAuto;

    @Column(name = "codebanq")
    private BigDecimal codeBanq;

    @Column(name = "codeloca")
    private BigDecimal codeLoca;

    @Column(name = "nucobain", length = 16)
    private String nucobain;

    @Column(name = "numcptba", length = 16)
    private String numCptba;

    @Column(name = "cle_rib")
    private Short cleRib;

    @Column(name = "idechelo", length = 40)
    private String ideChelo;

    @Column(name = "codepays", length = 4)
    private String codePays;

    @Column(name = "codedevi", length = 4)
    private String codeDevi;

    @Column(name = "competra", length = 24)
    private String competra;

    @Column(name = "montdevi")
    private BigDecimal montDevi;

    @Column(name = "refeoper", length = 30)
    private String refeOper;

    @Column(name = "dateenvo")
    private LocalDate dateEnvo;

    @Column(name = "numeenvo")
    private Short numeEnvo;

    @Column(name = "idecheet", length = 100)
    private String ideCheEt;

    @Column(name = "ccp_etra", length = 3)
    private String ccpEtra;

    @Column(name = "adrebene", length = 60)
    private String adreBene;

    @Column(name = "refautav", length = 15)
    private String refAutav;

    @Column(name = "numeeffe", length = 15)
    private String numeEffe;

    @Column(name = "datprepr")
    private LocalDate datPrepr;

    @Column(name = "datdeupr")
    private LocalDate datDeupr;

    @Column(name = "dattropr")
    private LocalDate datTropr;

    @Column(name = "origenof", length = 1)
    private String origenof;

    @Column(name = "codutisa")
    private BigDecimal codUtisa;

    @Column(name = "codpgmsa", length = 8)
    private String codPgmsa;

    @Column(name = "codmacsa", length = 20)
    private String codMacsa;

    @Column(name = "datmajof")
    private LocalDateTime datMajof;

    @Column(name = "codutiva")
    private BigDecimal codUtiva;

    @Column(name = "cobpvali")
    private BigDecimal cobpVali;

    @Column(name = "codpgmva", length = 8)
    private String codPgmva;

    @Column(name = "codmacva", length = 20)
    private String codMacva;

    @Column(name = "datvalof")
    private LocalDateTime datValof;

    @Column(name = "comoreop")
    private BigDecimal comoreOp;

    @Column(name = "commreje", length = 60)
    private String commReje;

    @Column(name = "menmarde", length = 60)
    private String menMarde;

    @Column(name = "menmarcr", length = 60)
    private String menMarcr;

    @Column(name = "codstaop", length = 1)
    private String codStaop;

    @Column(name = "datofori")
    private LocalDate datOfori;

    @Column(name = "bpofiori")
    private BigDecimal bpOfiori;

    @Column(name = "ordofori")
    private BigDecimal ordOfori;

    @Column(name = "datogori")
    private LocalDate datOgori;

    @Column(name = "bpogeori")
    private BigDecimal bpGeori;

    @Column(name = "ordogori")
    private BigDecimal ordOgori;

    @Column(name = "datebord")
    private LocalDate dateBord;

    @Column(name = "codbpbor")
    private BigDecimal codBpbor;

    @Column(name = "ordrbord")
    private BigDecimal ordrBord;

    @Column(name = "nuopetel", length = 16)
    private String nuopetel;

    @Column(name = "numegab", length = 15)
    private String numeGab;

    @Column(name = "ordrexec")
    private Integer ordrexec;

    @Column(name = "cpteinit")
    private BigDecimal cpteInit;

    @Column(name = "datderpr")
    private LocalDate datDerpr;

    @Column(name = "bloctaxe", length = 1)
    private String bloctaxe;

    @Column(name = "ancstaop", length = 1)
    private String ancStaop;

    @Column(name = "montfrai")
    private BigDecimal montFrai;

    @Column(name = "montcomi")
    private BigDecimal montComi;

    @Column(name = "montdirh")
    private BigDecimal montDirh;

    @Column(name = "datcreateof")
    private LocalDateTime datCreateOf;

    public LocalDate getDateOper() {
        return dateOper;
    }

    public void setDateOper(LocalDate dateOper) {
        this.dateOper = dateOper;
    }

    public BigDecimal getCodBurpo() {
        return codBurpo;
    }

    public void setCodBurpo(BigDecimal codBurpo) {
        this.codBurpo = codBurpo;
    }

    public BigDecimal getNumOrdof() {
        return numOrdof;
    }

    public void setNumOrdof(BigDecimal numOrdof) {
        this.numOrdof = numOrdof;
    }

    public String getCodTypop() {
        return codTypop;
    }

    public void setCodTypop(String codTypop) {
        this.codTypop = codTypop;
    }

    public LocalDate getDateEffe() {
        return dateEffe;
    }

    public void setDateEffe(LocalDate dateEffe) {
        this.dateEffe = dateEffe;
    }

    public LocalDate getDateTitr() {
        return dateTitr;
    }

    public void setDateTitr(LocalDate dateTitr) {
        this.dateTitr = dateTitr;
    }

    public LocalDate getDateVale() {
        return dateVale;
    }

    public void setDateVale(LocalDate dateVale) {
        this.dateVale = dateVale;
    }

    public String getCommenta() {
        return commenta;
    }

    public void setCommenta(String commenta) {
        this.commenta = commenta;
    }

    public String getReftitju() {
        return reftitju;
    }

    public void setReftitju(String reftitju) {
        this.reftitju = reftitju;
    }

    public BigDecimal getCodeOrga() {
        return codeOrga;
    }

    public void setCodeOrga(BigDecimal codeOrga) {
        this.codeOrga = codeOrga;
    }

    public Short getNumAutav() {
        return numAutav;
    }

    public void setNumAutav(Short numAutav) {
        this.numAutav = numAutav;
    }

    public String getCpteDebi() {
        return cpteDebi;
    }

    public void setCpteDebi(String cpteDebi) {
        this.cpteDebi = cpteDebi;
    }

    public String getCpteCred() {
        return cpteCred;
    }

    public void setCpteCred(String cpteCred) {
        this.cpteCred = cpteCred;
    }

    public String getTypePiec() {
        return typePiec;
    }

    public void setTypePiec(String typePiec) {
        this.typePiec = typePiec;
    }

    public String getNumPieid() {
        return numPieid;
    }

    public void setNumPieid(String numPieid) {
        this.numPieid = numPieid;
    }

    public LocalDate getDatPieid() {
        return datPieid;
    }

    public void setDatPieid(LocalDate datPieid) {
        this.datPieid = datPieid;
    }

    public String getNomTire() {
        return nomTire;
    }

    public void setNomTire(String nomTire) {
        this.nomTire = nomTire;
    }

    public String getNomExpe() {
        return nomExpe;
    }

    public void setNomExpe(String nomExpe) {
        this.nomExpe = nomExpe;
    }

    public String getVilleExpe() {
        return villeExpe;
    }

    public void setVilleExpe(String villeExpe) {
        this.villeExpe = villeExpe;
    }

    public Short getNombTitr() {
        return nombTitr;
    }

    public void setNombTitr(Short nombTitr) {
        this.nombTitr = nombTitr;
    }

    public BigDecimal getNbrRepfo() {
        return nbrRepfo;
    }

    public void setNbrRepfo(BigDecimal nbrRepfo) {
        this.nbrRepfo = nbrRepfo;
    }

    public LocalDate getDafiRefo() {
        return dafiRefo;
    }

    public void setDafiRefo(LocalDate dafiRefo) {
        this.dafiRefo = dafiRefo;
    }

    public BigDecimal getMontOper() {
        return montOper;
    }

    public void setMontOper(BigDecimal montOper) {
        this.montOper = montOper;
    }

    public BigDecimal getTaxeOper() {
        return taxeOper;
    }

    public void setTaxeOper(BigDecimal taxeOper) {
        this.taxeOper = taxeOper;
    }

    public BigDecimal getTaxeTele() {
        return taxeTele;
    }

    public void setTaxeTele(BigDecimal taxeTele) {
        this.taxeTele = taxeTele;
    }

    public BigDecimal getDeboOper() {
        return deboOper;
    }

    public void setDeboOper(BigDecimal deboOper) {
        this.deboOper = deboOper;
    }

    public Integer getNumEemis() {
        return numEemis;
    }

    public void setNumEemis(Integer numEemis) {
        this.numEemis = numEemis;
    }

    public BigDecimal getCodBpemi() {
        return codBpemi;
    }

    public void setCodBpemi(BigDecimal codBpemi) {
        this.codBpemi = codBpemi;
    }

    public String getDesBpemi() {
        return desBpemi;
    }

    public void setDesBpemi(String desBpemi) {
        this.desBpemi = desBpemi;
    }

    public LocalDate getDateEmis() {
        return dateEmis;
    }

    public void setDateEmis(LocalDate dateEmis) {
        this.dateEmis = dateEmis;
    }

    public BigDecimal getCodBppai() {
        return codBppai;
    }

    public void setCodBppai(BigDecimal codBppai) {
        this.codBppai = codBppai;
    }

    public Integer getNumEpaie() {
        return numEpaie;
    }

    public void setNumEpaie(Integer numEpaie) {
        this.numEpaie = numEpaie;
    }

    public Short getNumeAuto() {
        return numeAuto;
    }

    public void setNumeAuto(Short numeAuto) {
        this.numeAuto = numeAuto;
    }

    public BigDecimal getCodeBanq() {
        return codeBanq;
    }

    public void setCodeBanq(BigDecimal codeBanq) {
        this.codeBanq = codeBanq;
    }

    public BigDecimal getCodeLoca() {
        return codeLoca;
    }

    public void setCodeLoca(BigDecimal codeLoca) {
        this.codeLoca = codeLoca;
    }

    public String getNucobain() {
        return nucobain;
    }

    public void setNucobain(String nucobain) {
        this.nucobain = nucobain;
    }

    public String getNumCptba() {
        return numCptba;
    }

    public void setNumCptba(String numCptba) {
        this.numCptba = numCptba;
    }

    public Short getCleRib() {
        return cleRib;
    }

    public void setCleRib(Short cleRib) {
        this.cleRib = cleRib;
    }

    public String getIdeChelo() {
        return ideChelo;
    }

    public void setIdeChelo(String ideChelo) {
        this.ideChelo = ideChelo;
    }

    public String getCodePays() {
        return codePays;
    }

    public void setCodePays(String codePays) {
        this.codePays = codePays;
    }

    public String getCodeDevi() {
        return codeDevi;
    }

    public void setCodeDevi(String codeDevi) {
        this.codeDevi = codeDevi;
    }

    public String getCompetra() {
        return competra;
    }

    public void setCompetra(String competra) {
        this.competra = competra;
    }

    public BigDecimal getMontDevi() {
        return montDevi;
    }

    public void setMontDevi(BigDecimal montDevi) {
        this.montDevi = montDevi;
    }

    public String getRefeOper() {
        return refeOper;
    }

    public void setRefeOper(String refeOper) {
        this.refeOper = refeOper;
    }

    public LocalDate getDateEnvo() {
        return dateEnvo;
    }

    public void setDateEnvo(LocalDate dateEnvo) {
        this.dateEnvo = dateEnvo;
    }

    public Short getNumeEnvo() {
        return numeEnvo;
    }

    public void setNumeEnvo(Short numeEnvo) {
        this.numeEnvo = numeEnvo;
    }

    public String getIdeCheEt() {
        return ideCheEt;
    }

    public void setIdeCheEt(String ideCheEt) {
        this.ideCheEt = ideCheEt;
    }

    public String getCcpEtra() {
        return ccpEtra;
    }

    public void setCcpEtra(String ccpEtra) {
        this.ccpEtra = ccpEtra;
    }

    public String getAdreBene() {
        return adreBene;
    }

    public void setAdreBene(String adreBene) {
        this.adreBene = adreBene;
    }

    public String getRefAutav() {
        return refAutav;
    }

    public void setRefAutav(String refAutav) {
        this.refAutav = refAutav;
    }

    public String getNumeEffe() {
        return numeEffe;
    }

    public void setNumeEffe(String numeEffe) {
        this.numeEffe = numeEffe;
    }

    public LocalDate getDatPrepr() {
        return datPrepr;
    }

    public void setDatPrepr(LocalDate datPrepr) {
        this.datPrepr = datPrepr;
    }

    public LocalDate getDatDeupr() {
        return datDeupr;
    }

    public void setDatDeupr(LocalDate datDeupr) {
        this.datDeupr = datDeupr;
    }

    public LocalDate getDatTropr() {
        return datTropr;
    }

    public void setDatTropr(LocalDate datTropr) {
        this.datTropr = datTropr;
    }

    public String getOrigenof() {
        return origenof;
    }

    public void setOrigenof(String origenof) {
        this.origenof = origenof;
    }

    public BigDecimal getCodUtisa() {
        return codUtisa;
    }

    public void setCodUtisa(BigDecimal codUtisa) {
        this.codUtisa = codUtisa;
    }

    public String getCodPgmsa() {
        return codPgmsa;
    }

    public void setCodPgmsa(String codPgmsa) {
        this.codPgmsa = codPgmsa;
    }

    public String getCodMacsa() {
        return codMacsa;
    }

    public void setCodMacsa(String codMacsa) {
        this.codMacsa = codMacsa;
    }

    public LocalDateTime getDatMajof() {
        return datMajof;
    }

    public void setDatMajof(LocalDateTime datMajof) {
        this.datMajof = datMajof;
    }

    public BigDecimal getCodUtiva() {
        return codUtiva;
    }

    public void setCodUtiva(BigDecimal codUtiva) {
        this.codUtiva = codUtiva;
    }

    public BigDecimal getCobpVali() {
        return cobpVali;
    }

    public void setCobpVali(BigDecimal cobpVali) {
        this.cobpVali = cobpVali;
    }

    public String getCodPgmva() {
        return codPgmva;
    }

    public void setCodPgmva(String codPgmva) {
        this.codPgmva = codPgmva;
    }

    public String getCodMacva() {
        return codMacva;
    }

    public void setCodMacva(String codMacva) {
        this.codMacva = codMacva;
    }

    public LocalDateTime getDatValof() {
        return datValof;
    }

    public void setDatValof(LocalDateTime datValof) {
        this.datValof = datValof;
    }

    public BigDecimal getComoreOp() {
        return comoreOp;
    }

    public void setComoreOp(BigDecimal comoreOp) {
        this.comoreOp = comoreOp;
    }

    public String getCommReje() {
        return commReje;
    }

    public void setCommReje(String commReje) {
        this.commReje = commReje;
    }

    public String getMenMarde() {
        return menMarde;
    }

    public void setMenMarde(String menMarde) {
        this.menMarde = menMarde;
    }

    public String getMenMarcr() {
        return menMarcr;
    }

    public void setMenMarcr(String menMarcr) {
        this.menMarcr = menMarcr;
    }

    public String getCodStaop() {
        return codStaop;
    }

    public void setCodStaop(String codStaop) {
        this.codStaop = codStaop;
    }

    public LocalDate getDatOfori() {
        return datOfori;
    }

    public void setDatOfori(LocalDate datOfori) {
        this.datOfori = datOfori;
    }

    public BigDecimal getBpOfiori() {
        return bpOfiori;
    }

    public void setBpOfiori(BigDecimal bpOfiori) {
        this.bpOfiori = bpOfiori;
    }

    public BigDecimal getOrdOfori() {
        return ordOfori;
    }

    public void setOrdOfori(BigDecimal ordOfori) {
        this.ordOfori = ordOfori;
    }

    public LocalDate getDatOgori() {
        return datOgori;
    }

    public void setDatOgori(LocalDate datOgori) {
        this.datOgori = datOgori;
    }

    public BigDecimal getBpGeori() {
        return bpGeori;
    }

    public void setBpGeori(BigDecimal bpGeori) {
        this.bpGeori = bpGeori;
    }

    public BigDecimal getOrdOgori() {
        return ordOgori;
    }

    public void setOrdOgori(BigDecimal ordOgori) {
        this.ordOgori = ordOgori;
    }

    public LocalDate getDateBord() {
        return dateBord;
    }

    public void setDateBord(LocalDate dateBord) {
        this.dateBord = dateBord;
    }

    public BigDecimal getCodBpbor() {
        return codBpbor;
    }

    public void setCodBpbor(BigDecimal codBpbor) {
        this.codBpbor = codBpbor;
    }

    public BigDecimal getOrdrBord() {
        return ordrBord;
    }

    public void setOrdrBord(BigDecimal ordrBord) {
        this.ordrBord = ordrBord;
    }

    public String getNuopetel() {
        return nuopetel;
    }

    public void setNuopetel(String nuopetel) {
        this.nuopetel = nuopetel;
    }

    public String getNumeGab() {
        return numeGab;
    }

    public void setNumeGab(String numeGab) {
        this.numeGab = numeGab;
    }

    public Integer getOrdrexec() {
        return ordrexec;
    }

    public void setOrdrexec(Integer ordrexec) {
        this.ordrexec = ordrexec;
    }

    public BigDecimal getCpteInit() {
        return cpteInit;
    }

    public void setCpteInit(BigDecimal cpteInit) {
        this.cpteInit = cpteInit;
    }

    public LocalDate getDatDerpr() {
        return datDerpr;
    }

    public void setDatDerpr(LocalDate datDerpr) {
        this.datDerpr = datDerpr;
    }

    public String getBloctaxe() {
        return bloctaxe;
    }

    public void setBloctaxe(String bloctaxe) {
        this.bloctaxe = bloctaxe;
    }

    public String getAncStaop() {
        return ancStaop;
    }

    public void setAncStaop(String ancStaop) {
        this.ancStaop = ancStaop;
    }

    public BigDecimal getMontFrai() {
        return montFrai;
    }

    public void setMontFrai(BigDecimal montFrai) {
        this.montFrai = montFrai;
    }

    public BigDecimal getMontComi() {
        return montComi;
    }

    public void setMontComi(BigDecimal montComi) {
        this.montComi = montComi;
    }

    public BigDecimal getMontDirh() {
        return montDirh;
    }

    public void setMontDirh(BigDecimal montDirh) {
        this.montDirh = montDirh;
    }

    public LocalDateTime getDatCreateOf() {
        return datCreateOf;
    }

    public void setDatCreateOf(LocalDateTime datCreateOf) {
        this.datCreateOf = datCreateOf;
    }
}