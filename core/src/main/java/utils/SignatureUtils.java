package utils;

import javax.enterprise.context.Dependent;
import java.util.*;

@Dependent
public class SignatureUtils {
    public class SignatureWrapper implements Comparable<SignatureWrapper> {
        private String fisrtName;
        private String lastName;
        private byte[] signature;
        private String stateActionName;
        private Long position;


        public String getFisrtName() {
            return fisrtName;
        }
        public void setFisrtName(String fisrtName) {
            this.fisrtName = fisrtName;
        }

        public String getLastName() {
            return lastName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public byte[] getSignature() {
            return signature;
        }
        public void setSignature(byte[] signature) {
            this.signature = signature;
        }

        public String getStateActionName() {
            return stateActionName;
        }
        public void setStateActionName(String stateActionName) {
            this.stateActionName = stateActionName;
        }

        public Long getPosition() {
            return position;
        }

        public void setPosition(Long position) {
            this.position = position;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof SignatureWrapper)) return false;

            SignatureWrapper that = (SignatureWrapper) o;

            if (fisrtName != null ? !fisrtName.equals(that.fisrtName) : that.fisrtName != null) return false;
            if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
            if (!Arrays.equals(signature, that.signature)) return false;
            if (stateActionName != null ? !stateActionName.equals(that.stateActionName) : that.stateActionName != null)
                return false;
            return position != null ? position.equals(that.position) : that.position == null;
        }

        @Override
        public int hashCode() {
            int result = fisrtName != null ? fisrtName.hashCode() : 0;
            result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
            result = 31 * result + Arrays.hashCode(signature);
            result = 31 * result + (stateActionName != null ? stateActionName.hashCode() : 0);
            result = 31 * result + (position != null ? position.hashCode() : 0);
            return result;
        }

        @Override
        public int compareTo(SignatureWrapper o) {
            return this.getPosition().compareTo(o.getPosition());
        }
    }




  /*  public List<SignatureWrapper> fetchSignature(Object o){
        List<SignatureWrapper> signatureWrappers = new ArrayList<>();
        StateActionDao stateActionDao=EjbManagedBean.getBean(StateActionDao.class);
        Map<StateTransactionDto,CmPersonnelSignature> map = StateMachineUtils.findStateSignature(o);
        List<StateTransactionDto> stateTransactionDtos=new ArrayList<>(map.keySet());
        Collections.sort(stateTransactionDtos);
//        stateTransactionDtos.parallelStream().forEach(stateTransaction -> {
//            if (stateActionDao.findById(stateTransaction.getStateActionId()).getToState().isSignature()){
//                SignatureWrapper signatureWrapper = new SignatureWrapper();
//                signatureWrapper.setFisrtName(stateTransaction.getFirstName());
//                signatureWrapper.setLastName(stateTransaction.getLastName());
//                signatureWrapper.setStateActionName(stateTransaction.getStateActionName());
//                signatureWrapper.setSignature(map.get(stateTransaction).getSignatureAsByte());
//                signatureWrappers.add(signatureWrapper);
//            }
//
//        });
        Long position = 0l;
        for (StateTransactionDto stateTransaction:stateTransactionDtos){
            if (stateActionDao.findById(stateTransaction.getStateActionId()).getToState().isSignature()){
                SignatureWrapper signatureWrapper = new SignatureWrapper();
                signatureWrapper.setPosition(position++);
                signatureWrapper.setFisrtName(stateTransaction.getFirstName());
                signatureWrapper.setLastName(stateTransaction.getLastName());
                signatureWrapper.setStateActionName(stateTransaction.getStateActionName());
                signatureWrapper.setSignature( map.get(stateTransaction)!=null ? map.get(stateTransaction).getSignatureAsByte() : new byte[0]);
                signatureWrappers.add(signatureWrapper);
            }
        }

        return signatureWrappers;
    }
*/

}
