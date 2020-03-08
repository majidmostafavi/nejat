package security.permissions;

/**
 * Created by hossein on 2/1/17.
 */
public enum SalaryPermission {




    SalaryMenu("salary:salaryMenu","message.permission.salary.salaryMenu"),
    SalaryBasicInfo("salary:basicInfo","message.permission.salary.basicInfoMenu"),
    SalaryProcess("salary:process","message.permission.salary.processMenu"),
    SalaryReport("salary:report","message.permission.salary.reportMenu"),
    SalaryAccounting("salary:accounting","message.permission.salary.accountingMenu"),

    //SalaryMenu
    Insurance("salary:insurance","message.permission.salary.insurance"),
    InsuranceType("salary:insuranceType","message.permission.salary.insuranceType"),
    HiringMode("salary:hiringMode","message.permission.salary.hiringMode"),
    HiringType("salary:hiringType","message.permission.salary.hiringType"),
    SalaryItem("salary:salaryItem","message.permission.salary.salaryItem"),
    salaryItemType("salary:salaryItemType","message.permission.salary.salaryItemType"),
    salaryItemPortion("salary:salaryItemPortion","message.permission.salaryItemPortion"),
    salaryPayingType("salary:salaryPayingType","message.permission.salary.salaryPayingType"),
    HiringSalaryPerceptionRelation("salary:hiringSalaryPerceptionRelation","message.permission.salary.hiringSalaryPerceptionRelation"),
    JobSituationType("salary:jobSituationType","message.permission.salary.jobSituationType"),
    TaxType("salary:taxType","message.permission.salary.taxType"),

    Process("salary:salaryProcess","message.permission.salary.salaryProcess"),
    SalaryDocumentTemplate("salary:salaryDocumentTemplate","message.permission.salary.salaryDocumentTemplate"),

    BossCredit("salary:bossCredit","message.permission.salary.bossCredit");



    private String key;
    private String label;

    SalaryPermission(String key, String title) {
        this.key = key;
        this.label = title;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
}
