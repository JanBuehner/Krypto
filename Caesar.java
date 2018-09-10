public class Caesar
{
    public Caesar()
    {
        
    }
    
    public String codieren(String pEingabe, int pSchluessel)
    {
        String eingabe = pEingabe.toUpperCase();
        String codiert = "";
        int aktBuchstabe = 0; 
        
        for( int i = 0; i < eingabe.length(); i++)
        {
            aktBuchstabe = eingabe.charAt(i) + pSchluessel;
            if(aktBuchstabe > 90)
            {
                int hHelp = aktBuchstabe - 90;
                aktBuchstabe = 64 + hHelp;
                codiert = codiert + (char) aktBuchstabe;
            }
            else 
            {
                codiert = codiert + (char) aktBuchstabe;
            }
        }
        System.out.println(codiert);
        return codiert;
    }
    
    public String decodieren(String pEingabe, int pSchluessel)
    {
        String eingabe = pEingabe.toUpperCase();
        String decodiert = "";
        int aktBuchstabe = 0; 
        
        for( int i = 0; i < eingabe.length(); i++)
        {
            aktBuchstabe = eingabe.charAt(i) - pSchluessel;
            if(aktBuchstabe < 65)
            {
                int hHelp = 65 - aktBuchstabe;
                aktBuchstabe = 91 - hHelp;
                decodiert = decodiert + (char) aktBuchstabe;
            }
            else 
            {
                decodiert = decodiert + (char) aktBuchstabe;
            }
        }
        return decodiert;
    }
    
    public void brutalForce(String pEingabe)
    {
        String eingabe = pEingabe.toUpperCase();
        String decodiert = "";
        int aktBuchstabe = 0; 
        
        for(int i = 0; i < 26; i++)
        {
            for( int j = 0; j < eingabe.length(); j++)
            {
                aktBuchstabe = eingabe.charAt(j) - i;
                if(aktBuchstabe < 65)
                {
                    int hHelp = 65 - aktBuchstabe;
                    aktBuchstabe = 91 - hHelp;
                    decodiert = decodiert + (char) aktBuchstabe;
                }
                else 
                {
                    decodiert = decodiert + (char) aktBuchstabe;
                }
            }
            System.out.println(decodiert + " bei Schluessel " + i);
            decodiert = "";
        }
    }
    
    
}
