package com.example.danceculture.guiaturistica;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by DanceCulture on 18/10/17.
 */



public class Establecimiento {

    @SerializedName("correo_electronico")
    @Expose
    private String correoElectronico;
    @SerializedName("direccion")
    @Expose
    private String direccion;
    @SerializedName("nombre_del_establecimiento")
    @Expose
    private String nombreDelEstablecimiento;
    @SerializedName("responsable")
    @Expose
    private String responsable;
    @SerializedName("telefonos_de_contacto")
    @Expose
    private String telefonosDeContacto;
    @SerializedName("tipo_de_establecimiento")
    @Expose
    private String tipoDeEstablecimiento;

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombreDelEstablecimiento() {
        return nombreDelEstablecimiento;
    }

    public void setNombreDelEstablecimiento(String nombreDelEstablecimiento) {
        this.nombreDelEstablecimiento = nombreDelEstablecimiento;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getTelefonosDeContacto() {
        return telefonosDeContacto;
    }

    public void setTelefonosDeContacto(String telefonosDeContacto) {
        this.telefonosDeContacto = telefonosDeContacto;
    }

    public String getTipoDeEstablecimiento() {
        return tipoDeEstablecimiento;
    }

    public void setTipoDeEstablecimiento(String tipoDeEstablecimiento) {
        this.tipoDeEstablecimiento = tipoDeEstablecimiento;
    }

}

