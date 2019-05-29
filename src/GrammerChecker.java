public class GrammerChecker implements Interpreter {

    private Character uppercases[];
    private Character peroid;

    public GrammerChecker (Character upper[] ,Character p) {
        this.uppercases = upper;
        this.peroid = p;
    }
    @Override
    public boolean interpretFirstLetter(Character firstletter) {
        for(int i=0;i<uppercases.length;i++){
            if(firstletter.equals(uppercases[i])){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean interpretPeroiSymbol(String sentence) {
        int len = sentence.length();
        if(sentence.charAt(len -1) == peroid){
            return true;
        }
        return false;
    }
}
