package es.jrodg85.realestate;

public class Oferta {

  // atributos

  private Long idOferta;
  private Vivienda vivienda;

  // getters



  public Long getIdOferta() {
    return idOferta;
  }

  public Vivienda getVivienda() {
    return vivienda;
  }

  // setters

  public void setIdOferta(Long idOferta) {
    this.idOferta = idOferta;
  }

  public void setVivienda(Vivienda vivienda) {
    this.vivienda = vivienda;

  }

  // contructores

  public Oferta() {}


  public Oferta(Vivienda vivienda) {
    this.vivienda = vivienda;
  }

}
