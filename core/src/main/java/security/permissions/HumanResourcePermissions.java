package security.permissions;

/**
 * Created by hossein on 1/31/17.
 */
public enum HumanResourcePermissions {

    HumanResourceMenu("HumanResource:humanResourceMenu","message.permission.humanResource.humanResourceMenu"),
    HumanResourceBasicInfo("HumanResource:basicInfo","message.permission.humanResource.basicInfoMenu"),
    HumanResourceProcess("HumanResource:process","message.permission.humanResource.processMenu"),
    HumanResourceReport("HumanResource:report","message.permission.humanResource.reportMenu"),

    // humanResourceSubMenu
    JobSubMenu("HumanResource:jobSubMenu","message.permission.humanResource.jobSubMenu"),
    PersonnelSubMenu("HumanResource:personnelSubMenu","message.permission.humanResource.personnelSubMenu"),
    EducationSubMenu("HumanResource:educationSubMenu","message.permission.humanResource.educationSubMenu"),
    FacilitySubMenu("HumanResource:facilitySubMenu","message.permission.humanResource.facilitySubMenu"),
    ProcessFacilitySubMenu("HumanResource:processFacilitySubMenu","message.permission.humanResource.processFacilitySubMenu"),
    ReportFacilitySubMenu("HumanResource:reportFacilitySubMenu","message.permission.humanResource.reportFacilitySubMenu"),


    //HumanResource
    Personnel("HumanResource:personnel","message.permission.humanResource.personnel"),
    PostType("HumanResource:postType","message.permission.humanResource.postType"),
    Post("HumanResource:post","message.permission.humanResource.post"),
    expertise("HumanResource:expertise","message.permission.humanResource.expertise"),
    StatementType("HumanResource:statementType","message.permission.humanResource.statementType"),
    maritalStatus("HumanResource:maritalStatus","message.permission.humanResource.maritalStatus"),
    militaryStatus("HumanResource:militaryStatus","message.permission.humanResource.militaryStatus"),
    religion("HumanResource:religion","message.permission.humanResource.religion"),
    sect("HumanResource:sect","message.permission.humanResource.sect"),
    jobCategory("HumanResource:jobCategory","message.permission.humanResource.jobCategory"),
    jobBranch("HumanResource:jobBranch","message.permission.humanResource.jobBranch"),
    job("HumanResource:job","message.permission.humanResource.job"),
    jobType("HumanResource:jobType","message.permission.humanResource.jobType"),
    personMaritalStatus("HumanResource:personMaritalStatus","message.permission.humanResource.personMaritalStatus"),
    personEducation("HumanResource:personEducation","message.permission.humanResource.personEducation"),
    personInsurance("HumanResource:personInsurance","message.permission.humanResource.personInsurance"),
    personBank("HumanResource:personBank","message.permission.humanResource.personBank"),
    educationLevel("HumanResource:educationLevel","message.permission.humanResource.educationLevel"),
    educationBranch("HumanResource:educationBranch","message.permission.humanResource.educationBranch"),
    Education("HumanResource:education","message.permission.humanResource.education"),
    EducationGrade("HumanResource:educationGrade","message.permission.humanResource.educationGrade"),
    Statement("HumanResource:statement","message.permission.humanResource.statement"),
    PercentSalaryReport("HumanResource:percentSalaryReport","message.permission.humanResource.percentSalaryReport"),

    FacilityRequest("HumanResource:facilityRequest","message.permission.humanResource.facilityRequest"),
    FacilityType("HumanResource:facilityType","message.permission.humanResource.facilityType"),
    FacilityProperty("HumanResource:facilityProperty","message.permission.humanResource.facilityProperty"),
    FacilityGroup("HumanResource:facilityGroup","message.permission.humanResource.facilityGroup"),
    Facility("HumanResource:facility","message.permission.humanResource.facility"),
    FacilityRequestReport("HumanResource:facilityRequestReport","message.permission.humanResource.facilityRequestReport"),





//    Guild("HumanResource:guild","message.permission.humanResource.guild"),
    //    GeoLocation("HumanResource:geoLocation","message.permission.humanResource.geoLocation"),

    //HumanResourceAction
        //Statement
    StatementCreateApproved("HumanResource:statementCreateApproved","message.permission.humanResource.statementCreateApproved"),
    StatementCreateSignify("HumanResource:statementCreateSignify","message.permission.humanResource.statementCreateSignify"),
    StatementEditApproved("HumanResource:statementEditApproved","message.permission.humanResource.statementEditApproved"),
    StatementEditSignify("HumanResource:statementEditSignify","message.permission.humanResource.statementEditSignify"),
    StatementCopyApproved("HumanResource:statementCopyApproved","message.permission.humanResource.statementCopyApproved"),
    StatementCopySignify("HumanResource:statementCopySignify","message.permission.humanResource.statementCopySignify"),
    StatementDelete("HumanResource:statementDelete","message.permission.humanResource.statementDelete"),
    StatementPersonnelStatements("HumanResource:statementPersonnelStatements","message.permission.humanResource.statementPersonnelStatements"),

        //Personnel
    PersonnelCreate("HumanResource:personnelCreate","message.permission.humanResource.personnelCreate"),
    PersonnelEdit("HumanResource:personnelEdit","message.permission.humanResource.personnelEdit"),
    PersonnelDelete("HumanResource:personnelDelete","message.permission.humanResource.personnelDelete"),

        //facility
    FacilityTypeCreate("HumanResource:facilityTypeCreate","message.permission.HumanResource.facilityTypeCreate"),
    FacilityTypeEdit("HumanResource:facilityTypeEdit","message.permission.HumanResource.facilityTypeEdit"),
    FacilityTypeDelete("HumanResource:facilityTypeDelete","message.permission.HumanResource.facilityTypeDelete"),
    FacilityTypeDisable("HumanResource:facilityTypeDisable","message.permission.HumanResource.facilityTypeDisable"),
    FacilityTypeEnable("HumanResource:facilityTypeEnable","message.permission.HumanResource.facilityTypeEnable"),
    FacilityPropertyCreate("HumanResource:facilityPropertyCreate","message.permission.HumanResource.facilityPropertyCreate"),
    FacilityPropertyEdit("HumanResource:facilityPropertyEdit","message.permission.HumanResource.facilityPropertyEdit"),
    FacilityPropertyDelete("HumanResource:facilityPropertyDelete","message.permission.HumanResource.facilityPropertyDelete"),
    FacilityPropertyDisable("HumanResource:facilityPropertyDisable","message.permission.HumanResource.facilityPropertyDisable"),
    FacilityPropertyEnable("HumanResource:facilityPropertyEnable","message.permission.HumanResource.facilityPropertyEnable"),
    FacilityCreate("HumanResource:facilityCreate","message.permission.HumanResource.facilityCreate"),
    FacilityEdit("HumanResource:facilityEdit","message.permission.HumanResource.facilityEdit"),
    FacilityDelete("HumanResource:facilityDelete","message.permission.HumanResource.facilityDelete"),
    FacilityGroupCreate("HumanResource:facilityGroupCreate","message.permission.HumanResource.facilityGroupCreate"),
    FacilityGroupEdit("HumanResource:facilityGroupEdit","message.permission.HumanResource.facilityGroupEdit"),
    FacilityGroupPropertyCreate("HumanResource:facilityGroupPropertyCreate","message.permission.HumanResource.facilityGroupPropertyCreate"),
    FacilityGroupPropertyEditDelete("HumanResource:facilityGroupPropertyEditDelete","message.permission.HumanResource.facilityGroupPropertyEditDelete"),
    FacilityGroupDelete("HumanResource:facilityGroupDelete","message.permission.HumanResource.facilityGroupDelete"),
    FacilityGroupDisable("HumanResource:facilityGroupDisable","message.permission.HumanResource.facilityGroupDisable"),
    FacilityGroupEnable("HumanResource:facilityGroupEnable","message.permission.HumanResource.facilityGroupEnable"),

        //Special

    FacilityRequestManager("HumanResource:facilityRequestManager","message.permission.HumanResource.facilityRequestManager"),


    FacilityRequestCreate("HumanResource:facilityRequestCreate","message.permission.HumanResource.facilityRequestCreate"),
    FacilityRequestEdit("HumanResource:facilityRequestEdit","message.permission.HumanResource.facilityRequestEdit"),
    FacilityRequestDelete("HumanResource:facilityRequestDelete","message.permission.HumanResource.facilityRequestDelete");

    private final String label;

    private final String key;

    HumanResourcePermissions(String key, String label) {
        this.label = label;
        this.key = key;
    }

    public String getLabel() {
        return this.label;
    }

    public String getKey() {
        return key;
    }
}
