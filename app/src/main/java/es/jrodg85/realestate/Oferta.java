package es.jrodg85.realestate;

public abstract class Oferta {

  // añado campos a Oferta

  private long idOferta;

  // Añado getters a Oferta

  public long getIdOferta() {
    return idOferta;
  }

  // Añado setters a Oferta

  public void setIdOferta(int idOferta) {
    this.idOferta = idOferta;
  }

  // añado constructores

  public Oferta() {};

  public Oferta(long idOferta) {
    this.idOferta = idOferta;
  }


}
