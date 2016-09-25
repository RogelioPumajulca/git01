package pe.edu.upc.entity;

import pe.edu.upc.interfaces.IEmpleado;
//import pe.edu.upc.interfaces.Metodos;
import pe.edu.upc.interfaces.PorPagar;

// La superclase abstracta Empleado que implementa a PorPagar.
//Nota: Aqui no implementamos el metodo obtenerMontoPago de PorPagar, asi que
// esta clase debe declararse como abstract para evitar un error de compilacion.
public abstract class Empleado implements PorPagar, IEmpleado
{
   private String primerNombre;
   private String apellidoPaterno;
   private String numeroSeguroSocial;

   // constructor con tres argumentos
   public Empleado( String primerNombre, String apellidoPaterno, String numeroSeguroSocial )
   {
      this.primerNombre = primerNombre;
      this.apellidoPaterno = apellidoPaterno;
      this.numeroSeguroSocial = numeroSeguroSocial;
   } 
   
   // establece el primer nombre
   public void setPrimerNombre( String primerNombre )
   {
      this.primerNombre = primerNombre; 
   } 

   // devuelve el primer nombre
   public String getPrimerNombre()
   {
      return this.primerNombre;
   } 

   // establece el apellido paterno
   public void setApellidoPaterno( String apellidoPaterno )
   {
      this.apellidoPaterno = apellidoPaterno;  
   } 

   // devuelve el apellido paterno
   public String getApellidoPaterno()
   {
      return this.apellidoPaterno;
   } 

   // establece el numero de seguro social
   public void setNumeroSeguroSocial( String numeroSeguroSocial )
   {
      this.numeroSeguroSocial = numeroSeguroSocial;
   } 

   // devuelve el numero de seguro social
   public String getNumeroSeguroSocial()
   {
      return this.numeroSeguroSocial;
   } 

   // devuelve representacion String de un objeto Empleado
   @Override
   public String toString()
   {
      return String.format( "%s %s\nnumero de seguro social: %s", 
         getPrimerNombre(), getApellidoPaterno(), getNumeroSeguroSocial() );
   } 

   
} 

