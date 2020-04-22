public class User {
    
    private String nrmat;
    private String nume;
    private String facultate;
    private int an;
    private String sport;
    private int prezente;
    
    public User(String nrmat, String nume, String facultate, int an,String sport,int prezente)
    {
        this.nrmat=nrmat;
        this.nume=nume;
        this.facultate=facultate;
        this.an=an;
        this.sport=sport;
        this.prezente=prezente;
        
    }
    public String getNrMat(){
        return nrmat;
    }
    
    public String getNume()
    {
        return nume;
    }
    
    public String getFacultate()
    {
        return facultate;
    }
    
    public int getAn()
    {
        return an;
    }
    public String getSport()
    {
         return sport;
            
    }
    public int getPrezente()
    {
        return prezente;
    }
}
