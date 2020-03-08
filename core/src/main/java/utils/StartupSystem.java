package utils;

import java.util.Arrays;
import java.util.List;

/**
 * Created by majid on 6/28/16.
 */
public class StartupSystem {

    public enum PositionType {

        approved("approved", "message.positionType.approved"),
        issued("issued", "message.positionType.issued");
        private final String key;
        private final String name;

        PositionType(String key, String name) {
            this.key = key;
            this.name = name;
        }

        public String getKey() {
            return key;
        }

        public String getName() {
            return name;
        }

        public static List<PositionType> findAll() {
            return Arrays.asList(values());
        }

    }

    public enum OrganizationType {

//        ArmyStaff("armyStaff", "message.organization.type.army.staff"),
//        Province("province", "message.organization.type.province"),
//        Organization("organization", "message.organization.type.organization"),
//        Remainder("reminder", "message.organization.type.remainder"),
//        AccountAbility("accountAbility", "message.organization.type.account.ability");
        None("none", "message.organization.type.none"),
        Hospital("hospital", "message.organization.type.hospital"),
        Faculty("faculty", "message.organization.type.faculty"),
        ResearchCenter("research", "message.organization.type.research"),
        College("college", "message.organization.type.college"),
        Health("health", "message.organization.type.network"),
        Pharmacy("pharmacy", "message.organization.type.pharmacy");

        private final String key;
        private final String name;

        OrganizationType(String key, String name) {
            this.name = name;
            this.key = key;
        }

        public String getKey() {
            return key;
        }

        public String getName() {
            return name;
        }

        public static List<OrganizationType> findAll() {
            return Arrays.asList(values());
        }
    }


//    public enum DocumentTypeEnum {
//
//        Ordinary("ordinary", "message.document.type.ordinary"),
//        Normal("normal", "message.document.type.normal"),
//        ToBindTemporary("toBindTemporary", "message.document.type.toBind.temporary"),
//        ToBindContinual("toBindContinual", "message.document.type.toBind.continual"),
//        Inaugural("inaugural", "message.document.type.inaugural");
//
//        private final String key;
//        private final String name;
//
//        DocumentTypeEnum(String key, String name) {
//            this.name = name;
//            this.key = key;
//        }
//
//
//        public static DocumentTypeEnum getValue (String key){
//            if (key!=null){
//                if (key.equals(Ordinary.getKey())){
//                    return Ordinary;
//                }else if (key.equals(Normal.getKey())){
//                    return Normal;
//                }else if (key.equals(ToBindTemporary.getKey())){
//                    return ToBindTemporary;
//                }else if (key.equals(ToBindContinual.getKey())){
//                    return ToBindContinual;
//                }else if (key.equals(Inaugural.getKey())){
//                    return Inaugural;
//                }
//            }
//            return null;
//        }
//
//        public String getKey() {
//            return key;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public static List<DocumentTypeEnum> findAll() {
//            return Arrays.asList(values());
//        }
//    }



    public enum AgreemnetKind {

        normal("normmal", "message.common.agreement.normal"),
        complement("complement", "message.common.agreement.complement");

        private final String key;
        private final String name;

        AgreemnetKind(String key, String name) {
            this.name = name;
            this.key = key;
        }

        public String getKey() {
            return key;
        }

        public String getName() {
            return name;
        }

        public static List<AgreemnetKind> findAll() {
            return Arrays.asList(values());
        }
    }

    public enum ContradictionType {

        CRCT_Auto_ChequeAmount("CRCT_Auto_ChequeAmount", "message.treasury.contradictionType.chequeAmount"),
        CRCT_Auto_DateAmount("CRCT_Auto_DateAmount", "message.treasury.contradictionType.dateAmount"),
        CRCT_Auto_Amount("CRCT_Auto_Amount", "message.treasury.contradictionType.amount"),
        CRCT_Auto_Transaction("CRCT_Auto_Transaction", "message.treasury.contradictionType.transaction"),
        CRCT_User("CRCT_User", "message.treasury.contradictionType.user");

        private final String key;
        private final String name;

        ContradictionType(String key, String name) {
            this.name = name;
            this.key = key;
        }

        public String getKey() {
            return key;
        }

        public String getName() {
            return name;
        }

        public static List<ContradictionType> findAll() {
            return Arrays.asList(values());
        }

    }

    public enum ContradictionSystemType {

        auto("auto", "message.common.contradiction.auto"),
        special("special", "message.common.contradiction.special"),
        manual("manual", "message.common.contradiction.manual");
        private final String key;
        private final String name;

        ContradictionSystemType(String key, String name) {
            this.name = name;
            this.key = key;
        }

        public String getKey() {
            return key;
        }

        public String getName() {
            return name;
        }

        public static List<ContradictionSystemType> findAll() {
            return Arrays.asList(values());
        }

    }


}
