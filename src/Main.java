void main() {

}
class NoTerminaEnBB{

    boolean esValida(String cadena){
        if (cadena == null){
            return true;
        }
        return q0(cadena, 0);
    }

    boolean q0(String cadena, int pos){
        if (pos == cadena.length()){
            return true;
        }
        char c = cadena.charAt(pos);
        if (c == 'b'){
            return q1(cadena, pos+1);
        }
        else if (c == 'a'){
            return q0(cadena, pos+1);
        }
        return false;
    }

    boolean q1(String cadena, int pos){
        if (pos == cadena.length()){
            return true;
        }
        char c = cadena.charAt(pos);
        if (c == 'b'){
            return q2(cadena, pos+1);
        }
        else if (c == 'a'){
            return q0(cadena, pos+1);
        }
        return false;
    }

    boolean q2(String cadena, int pos){
        if(pos == cadena.length()){
            return false;
        }
        char c = cadena.charAt(pos);
        if (c == 'b'){
            return q2 (cadena,pos+1);
        }
        else if (c == 'a'){
            return q0(cadena, pos+1);
        }
        return false;
    }
}

class TerminaEnBB{
    boolean esValida(String cadena){
        if (cadena == null){
            return false;
        }
        return q0(cadena, 0);
    }

    boolean q0(String cadena, int pos){
        if (pos == cadena.length()){
            return false;
        }
        char c = cadena.charAt(pos);
        if (c == 'b'){
            return q1(cadena, pos+1);
        }
        else if (c == 'a'){
            return q0(cadena, pos+1);
        }
        return false;
    }

    boolean q1(String cadena, int pos){
        if (pos == cadena.length()){
            return false;
        }
        char c = cadena.charAt(pos);
        if (c == 'b'){
            return q2(cadena, pos+1);
        }
        else if (c == 'a'){
            return q0(cadena, pos+1);
        }
        return false;
    }

    boolean q2(String cadena, int pos){
        if(pos == cadena.length()){
            return true;
        }
        char c = cadena.charAt(pos);
        if (c == 'b'){
            return q2 (cadena,pos+1);
        }
        else if (c == 'a'){
            return q0(cadena, pos+1);
        }
        return false;
    }
}

class NoContienABA{
    boolean esValida(String cadena){
        if(cadena == null){
            return true;
        }
        return q0(cadena, 0);
    }

    boolean q0(String cadena, int pos){
        if (pos == cadena.length()){
            return true;
        }
        char c = cadena.charAt(pos);
        if(c == 'a'){
            return q1(cadena, pos+1);
        }
        else if(c == 'b'){
            return q0(cadena,pos+1);
        }
        return false;
    }

    boolean q1(String cadena, int pos){
        if(pos == cadena.length()){
            return true;
        }
        char c = cadena.charAt(pos);
        if(c == 'b'){
            return q2(cadena, pos+1);
        }
        else if(c == 'a'){
            return q0(cadena, pos+1);
        }
        return false;
    }

    boolean q2(String cadena, int pos){
        if (pos == cadena.length()) {
            return true;
        }
            char c = cadena.charAt(pos);
            if(c == 'a'){
                return q3(cadena, pos+1);
            }
            else if(c == 'b'){
                q0(cadena, pos+1);
            }
        return false;
        }

        boolean q3(String cadena, int pos){
        return false;
        }
    }

    class DivisiblePorTresCeros{

    boolean esValida(String cadena){
        if(cadena == null){
            return true;
        }
        return q0(cadena, 0);
        }

    boolean q0(String cadena, int pos){
        if(pos == cadena.length()){
            return true;
        }
        char c = cadena.charAt(pos);
        if(c == '0'){
            return q1(cadena, pos+1);
        }
        else if(c == '1'){
            return q0(cadena, pos+1);
        }
        return false;
    }

    boolean q1(String cadena, int pos){
        if(pos == cadena.length()){
            return false;
        }
        char c = cadena.charAt(pos);
        if(c == '0'){
            return q2(cadena, pos+1);
        }
        else if(c == '1'){
            return q1(cadena, pos+'1');
        }
        return false;
    }

    boolean q2(String cadena, int pos){
        if(pos == cadena.length()){
            return false;
        }
        char c = cadena.charAt(pos);
        if(c == '0'){
            return q0(cadena, pos+1);
        }
        else if(c == '1'){
            return q2(cadena, pos+1);
        }
        return false;
    }
}

class NoContiene11PeroSi00{
    boolean esValida(String cadena){
        if(cadena == null){
            return false;
        }
        return q0(cadena, 0);
    }

    boolean q0(String cadena, int pos){
        if(pos == cadena.length()){
            return false;
        }
        char c = cadena.charAt(pos);
        if(c == '1'){
            return q1(cadena, pos+1);
        }
        else if(c == '0'){
            return q3(cadena, pos+1);
        }
        return false;
    }

    boolean q1(String cadena, int pos){
        if(pos == cadena.length()){
            return false;
        }
        char c = cadena.charAt(pos);
        if(c == '1'){
            return q2(cadena, pos+1);
        }
        else if(c == '0'){
            return q3(cadena, pos+1);
        }
        return false;
    }

    boolean q2(String cadena, int pos){
        return false;
    }

    boolean q3(String cadena, int pos){
        if(pos == cadena.length()){
            return false;
        }
        char c = cadena.charAt(pos);
        if(c == '1'){
            return q1(cadena, pos+1);
        }
        else if(c == '0'){
            return q4(cadena, pos+1);
        }
        return false;
    }

    boolean q4(String cadena, int pos){
        if(pos == cadena.length()){
            return true;
        }
        char c = cadena.charAt(pos);
        if(c == '1'){
            return q5(cadena, pos+1);
        }
        else if(c == '0'){
            return q4(cadena, pos+1);
        }
        return false;
    }

    boolean q5(String cadena, int pos){
        if(pos == cadena.length()){
            return true;
        }
        char c = cadena.charAt(pos);
        if(c == '1'){
            return q2(cadena, pos+1);
        }
        else if(c == '0'){
            return q4(cadena, pos+1);
        }
        return false;
    }
}

class NoIniciaConABAB{
    boolean esValida(String cadena){
        if(cadena == null){
            return true;
        }
        return q0(cadena, 0);
    }

    boolean q0(String cadena, int pos){
        if(pos == cadena.length()){
            return true;
        }
        char c = cadena.charAt(pos);
        if(c == 'a'){
            return q1(cadena, pos+1);
        }
        else if(c == 'b'){
            return q5(cadena, pos+1);
        }
        return false;
    }

    boolean q1(String cadena, int pos){
        if(pos == cadena.length()){
            return true;
        }
        char c = cadena.charAt(pos);
        if(c == 'a'){
            return q5(cadena, pos+1);
        }
        else if (c == 'b'){
            return q2(cadena, pos+1);
        }
        return false;
    }

    boolean q2(String cadena, int pos){
        if (pos == cadena.length()) {
            return true;
        }
        char c = cadena.charAt(pos);
        if (c == 'a'){
            return q3(cadena, pos+1);
        }
        else if(c == 'b'){
            return q5(cadena, pos+1);
        }
        return false;
    }

    boolean q3(String cadena, int pos){
        if(pos == cadena.length()){
            return true;
        }
        char c = cadena.charAt(pos);
        if (c == 'a'){
            return q5(cadena, pos+1);
        }
        if(c == 'b'){
            return q4(cadena, pos+1);
        }
        return false;
    }

    boolean q4(String cadena, int pos){
        return false;
    }

    boolean q5(String cadena, int pos){
        return true;
    }
}

class ImparAB{

    boolean esValida(String cadena){
        if(cadena == null){
            return false;
        }
        return q0(cadena, 0);
    }

    boolean q0(String cadena, int pos){
        if(pos == cadena.length()){
            return false;
        }
        char c = cadena.charAt(pos);
        if(c == 'a'){
            return q1(cadena, pos+1);
        }
        else if(c == 'b'){
            return q0(cadena, pos+1);
        }
        return false;
    }

    boolean q1(String cadena, int pos){
        if(pos == cadena.length()){
            return false;
        }
        char c = cadena.charAt(pos);
        if(c == 'a'){
            return q1(cadena, pos+1);
        }
        else if(c == 'b'){
            return q2(cadena, pos+1);
        }
        return false;
    }

    boolean q2(String cadena, int pos){
        if(pos == cadena.length()){
            return true;
        }
        char c = cadena.charAt(pos);
        if(c == 'a'){
            return q3(cadena, pos+1);
        }
        else if(c == 'b'){
            return q2(cadena, pos+1);
        }
        return false;
    }

    boolean q3(String cadena, int pos){
        if(pos == cadena.length()){
            return true;
        }
        char c = cadena.charAt(pos);
        if(c == 'a'){
            return q3(cadena, pos+1);
        }
        else if(c == 'b'){
            return q0(cadena, pos+1);
        }
        return false;
    }
}

class ContieneABAyTermiaBB{
    boolean esValida(String cadena){
        if(cadena == null){
            return false;
        }
        return q0(cadena, 0);
    }

    boolean q0(String cadena, int pos){
        if(pos == cadena.length()){
            return false;
        }
        char c = cadena.charAt(pos);
        if(c == 'a'){
            return q1(cadena, pos+1);
        } else if (c == 'b') {
            return q0(cadena, pos+1);
        }
        return false;
    }

    boolean q1(String cadena, int pos){
        if(pos == cadena.length()){
            return false;
        }
        char c = cadena.charAt(pos);
        if (c == 'a'){
            return q1(cadena, pos+1);
        }
        else if(c == 'b'){
            return q2(cadena, pos+1);
        }
        return false;
    }

    boolean q2(String cadena, int pos){
        if(pos == cadena.length()){
            return false;
        }
        char c = cadena.charAt(pos);
        if(c == 'a'){
            return q3(cadena, pos+1);
        }
        else if (c == 'b'){
            return q0(cadena, pos+1);
        }
        return false;
    }

    boolean q3(String cadena, int pos){
        if(pos == cadena.length()){
            return false;
        }
        char c = cadena.charAt(pos);
        if(c == 'a'){
            return q3(cadena, pos+1);
        }
        else if(c == 'b'){
            return q4(cadena, pos+1);
        }
        return false;
    }

    boolean q4(String cadena, int pos){
        if(pos == cadena.length()){
            return false;
        }
        char c = cadena.charAt(pos);
        if(c == 'a'){
            return q3(cadena,pos+1);
        }
        else if (c == 'b'){
            return q5(cadena, pos+1);
        }
        return false;
    }

    boolean q5(String cadena, int pos){
        if(pos == cadena.length()){
            return true;
        }
        char c = cadena.charAt(pos);
        if(c == 'a'){
            return q3(cadena, pos+1);
        }
        else if (c == 'b'){
            return q5(cadena, pos+1);
        }
        return false;
    }
}

class ComienzaBBoTerminaAA{

    boolean esValida(String cadena){
        if(cadena == null){
            return false;
        }
        return q0(cadena, 0);
    }

    boolean q0(String cadena, int pos){
        if(pos == cadena.length()){
            return false;
        }
        char c = cadena.charAt(pos);
        if(c == 'a'){
            return q3(cadena, pos+1);
        }
        else if(c == 'b'){
            return q1(cadena, pos+1);
        }
        return false;
    }

    boolean q1(String cadena, int pos){
        if(pos == cadena.length()){
            return false;
        }
        char c = cadena.charAt(pos);
        if(c == 'a'){
            return q3(cadena, pos+1);
        } else if (c == 'b') {

            return q2(cadena, pos+1);
        }
        return false;
    }

    boolean q2(String cadena, int pos){
        return true;
    }

    boolean q3(String cadena, int pos){
        if(pos == cadena.length()){
            return false;
        }
        char c = cadena.charAt(pos);
        if(c == 'a'){
            return q4(cadena, pos+1);
        }
        else if(c == 'b'){
            return q5(cadena, pos+1);
        }
        return false;
    }

    boolean q4(String cadena, int pos){
        if(pos == cadena.length()){
            return true;
        }
        char c = cadena.charAt(pos);
        if(c == 'a'){
            return q4(cadena, pos+1);
        }
        else if(c == 'b'){
            return q5(cadena, pos+1);
        }
        return false;
    }

    boolean q5(String cadena, int pos){
        if(pos == cadena.length()){
            return false;
        }
        char c =  cadena.charAt(pos);
        if(c == 'a'){
            return q3(cadena, pos+1);
        }
        else if(c == 'b'){
            return q5(cadena, pos+1);
        }
        return false;
    }
}

class CadenaParyParA{
    boolean esValida(String cadena){
        if(cadena == null){
            return true;
        }
        return q0(cadena, 0);
    }

    boolean q0(String cadena, int pos){
        if(pos == cadena.length()){
            return true;
        }
        char c = cadena.charAt(pos);
        if(c == 'a'){
            return q1(cadena, pos+1);
        }
        else if(c == 'b'){
            return q3(cadena, pos+1);
        }
        return false;
    }

    boolean q1(String cadena, int pos){
        if(pos == cadena.length()){
            return false;
        }
        char c = cadena.charAt(pos);
        if(c == 'a'){
            return q0(cadena, pos+1);
        }
        else if(c == 'b'){
            return q2(cadena, pos+1);
        }
        return false;
    }

    boolean q2(String cadena, int pos){
        if(pos == cadena.length()){
            return false;
        }
        char c = cadena.charAt(pos);
        if (c == 'a') {
            return q3(cadena, pos+1);
        }
        else if(c == 'b'){
            return q1(cadena, pos+1);
        }
        return false;
    }

    boolean q3(String cadena, int pos){
        if(pos == cadena.length()){
            return false;
        }
        char c = cadena.charAt(pos);
        if(c == 'a'){
            return q2(cadena,pos+1);
        }
        else if(c == 'b'){
            return q0(cadena, pos+1);
        }
        return false;
    }
}

public class ReconocedorDeIdentificadores {

    public static boolean validar(String cadena) {
        if (cadena == null || cadena.isEmpty()) return false;
        return q0(cadena, 0);
    }

    private static boolean q0(String cadena, int indice) {
        if (indice >= cadena.length()) return false;

        char c = cadena.charAt(indice);
        if (Character.isLetter(c) || c == '_') {
            return q1(cadena, indice + 1);
        }
        return false;
    }

    private static boolean q1(String cadena, int indice) {
        if (indice >= cadena.length()) return true;

        char c = cadena.charAt(indice);
        if (Character.isLetterOrDigit(c) || c == '_') {
            return q1(cadena, indice + 1);
        }
        return false;
    }
}