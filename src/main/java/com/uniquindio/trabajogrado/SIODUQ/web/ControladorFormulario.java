package com.uniquindio.trabajogrado.SIODUQ.web;

import com.uniquindio.trabajogrado.SIODUQ.model.FORMBONArticulosU;
import com.uniquindio.trabajogrado.SIODUQ.model.FORMBONDireccionTesis;
import com.uniquindio.trabajogrado.SIODUQ.model.FORMBONEstudioPosdoctoral;
import com.uniquindio.trabajogrado.SIODUQ.model.FORMBONOtrasRevistas;
import com.uniquindio.trabajogrado.SIODUQ.model.FORMBONPonencia;
import com.uniquindio.trabajogrado.SIODUQ.model.FORMPAArticulos;
import com.uniquindio.trabajogrado.SIODUQ.model.FORMPAAudiovisuales;
import com.uniquindio.trabajogrado.SIODUQ.model.FORMPALibroEnsayo;
import com.uniquindio.trabajogrado.SIODUQ.model.FORMPALibroInvestigacion;
import com.uniquindio.trabajogrado.SIODUQ.model.FORMPALibroTexto;
import com.uniquindio.trabajogrado.SIODUQ.model.FORMPAObraArtistica;
import com.uniquindio.trabajogrado.SIODUQ.model.FORMPAPatente;
import com.uniquindio.trabajogrado.SIODUQ.model.FORMPAProduccionTecnica;
import com.uniquindio.trabajogrado.SIODUQ.model.FORMPASoftware;
import com.uniquindio.trabajogrado.SIODUQ.model.FORMPAValLibroTexto;
import com.uniquindio.trabajogrado.SIODUQ.model.Formulario;
import com.uniquindio.trabajogrado.SIODUQ.model.Persona;
import com.uniquindio.trabajogrado.SIODUQ.model.Solicitud;
import com.uniquindio.trabajogrado.SIODUQ.model.TipoAporte;
import com.uniquindio.trabajogrado.SIODUQ.model.TipoDifusion;
import com.uniquindio.trabajogrado.SIODUQ.model.TipoMaterial;
import com.uniquindio.trabajogrado.SIODUQ.model.TipoObra;
import com.uniquindio.trabajogrado.SIODUQ.model.TipoPatente;
import com.uniquindio.trabajogrado.SIODUQ.model.TipoProduccion;
import com.uniquindio.trabajogrado.SIODUQ.model.TipoPublicacion;
import com.uniquindio.trabajogrado.SIODUQ.model.TipoReconocimiento;
import com.uniquindio.trabajogrado.SIODUQ.model.TipoRevista;
import com.uniquindio.trabajogrado.SIODUQ.model.TipoTesis;
import com.uniquindio.trabajogrado.SIODUQ.service.FORMBONArticulosUService;
import com.uniquindio.trabajogrado.SIODUQ.service.FORMBONDireccionTesisService;
import com.uniquindio.trabajogrado.SIODUQ.service.FORMBONOtrasRevistasService;
import com.uniquindio.trabajogrado.SIODUQ.service.FORMBONPonenciaService;
import com.uniquindio.trabajogrado.SIODUQ.service.FORMPAArticulosService;
import com.uniquindio.trabajogrado.SIODUQ.service.FORMPAAudiovisualesService;
import com.uniquindio.trabajogrado.SIODUQ.service.FORMPALibroEnsayoService;
import com.uniquindio.trabajogrado.SIODUQ.service.FORMPALibroInvestigacionService;
import com.uniquindio.trabajogrado.SIODUQ.service.FORMPALibroTextoService;
import com.uniquindio.trabajogrado.SIODUQ.service.FORMPAObraArtisticaService;
import com.uniquindio.trabajogrado.SIODUQ.service.FORMPAPatenteService;
import com.uniquindio.trabajogrado.SIODUQ.service.FORMPAProduccionTecnicaService;
import com.uniquindio.trabajogrado.SIODUQ.service.FORMPASoftwareService;
import com.uniquindio.trabajogrado.SIODUQ.service.FORMPAValLibroTextoService;
import com.uniquindio.trabajogrado.SIODUQ.service.FormularioService;
import com.uniquindio.trabajogrado.SIODUQ.util.Constantes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.uniquindio.trabajogrado.SIODUQ.service.FORMBONEstudioPosdoctoralService;
import com.uniquindio.trabajogrado.SIODUQ.service.PersonaService;
import com.uniquindio.trabajogrado.SIODUQ.service.SolicitudService;
import com.uniquindio.trabajogrado.SIODUQ.service.TipoAporteService;
import com.uniquindio.trabajogrado.SIODUQ.service.TipoDifusionService;
import com.uniquindio.trabajogrado.SIODUQ.service.TipoMaterialService;
import com.uniquindio.trabajogrado.SIODUQ.service.TipoObraService;
import com.uniquindio.trabajogrado.SIODUQ.service.TipoPatenteService;
import com.uniquindio.trabajogrado.SIODUQ.service.TipoProduccionService;
import com.uniquindio.trabajogrado.SIODUQ.service.TipoPublicacionService;
import com.uniquindio.trabajogrado.SIODUQ.service.TipoReconocimientoService;
import com.uniquindio.trabajogrado.SIODUQ.service.TipoRevistaService;
import com.uniquindio.trabajogrado.SIODUQ.service.TipoTesisService;
import java.util.List;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ControladorFormulario {

    @Autowired
    private FormularioService formularioService;
    @Autowired
    private FORMBONArticulosUService formularioArticulosUService;
    @Autowired
    private FORMBONDireccionTesisService formularioDireccionTesisService;
    @Autowired
    private FORMBONEstudioPosdoctoralService formularioPosdoctoralService;
    @Autowired
    private FORMBONOtrasRevistasService formularioOtrasRevistasService;
    @Autowired
    private FORMBONPonenciaService formularioPonenciaService;
    @Autowired
    private FORMPAArticulosService formularioArticulosService;
    @Autowired
    private FORMPAAudiovisualesService formularioAudiovisualService;
    @Autowired
    private FORMPALibroEnsayoService formularioLibroEnsayoService;
    @Autowired
    private FORMPALibroInvestigacionService formularioLibroInvestigacionService;
    @Autowired
    private FORMPALibroTextoService formularioLibroTextoService;
    @Autowired
    private FORMPAObraArtisticaService formularioObraArtisticaService;
    @Autowired
    private FORMPAPatenteService formularioPatenteService;
    @Autowired
    private FORMPAProduccionTecnicaService formularioProduccionTecnicaService;
    @Autowired
    private FORMPASoftwareService formularioSoftwareService;
    @Autowired
    private FORMPAValLibroTextoService formularioValLibroTextoService;
    @Autowired
    private SolicitudService solicitudService;
    @Autowired
    private PersonaService personaService;
    @Autowired
    private TipoDifusionService tipoDifusionService;
    @Autowired
    private TipoRevistaService tipoRevistaService;
    @Autowired
    private TipoTesisService tipoTesisService;
    @Autowired
    private TipoProduccionService tipoProduccionService;
    @Autowired
    private TipoPatenteService tipoPatenteService;
    @Autowired
    private TipoReconocimientoService tipoReconocimientoService;
    @Autowired
    private TipoObraService tipoObraService;
    @Autowired
    private TipoMaterialService tipoMaterialService;
    @Autowired
    private TipoAporteService tipoAporteService;
    @Autowired
    private TipoPublicacionService tipoPublicacionService;

    @GetMapping("/observarFormulario/{idFormulario}")
    public String buscarFormulario(Formulario formulario, Model model) {

        formulario = formularioService.encontrarFormulario(formulario);
        model.addAttribute("formulario", formulario);

        Solicitud solicitud = solicitudService.buscarSolicitudPorFormulario(formulario);
        model.addAttribute("solicitud", solicitud);

        String ruta = "";

        switch (formulario.getCodigo()) {
            case Constantes.FBARTICULO:
                FORMBONArticulosU formularioArticuloU = formularioArticulosUService.encontrarFORMBONArticulosU(formulario.getIdFormulario());
                model.addAttribute("formularioEspecifico", formularioArticuloU);
                ruta = Constantes.FBARTICULORUTA;
                break;
            case Constantes.FBDIRECCIONT:
                FORMBONDireccionTesis formularioDireccionTesis = formularioDireccionTesisService.encontrarFORMBONDireccionTesis(formulario.getIdFormulario());
                model.addAttribute("formularioEspecifico", formularioDireccionTesis);
                ruta = Constantes.FBDIRECCIONTRUTA;
                break;
            case Constantes.FBESTUDIOPOS:
                FORMBONEstudioPosdoctoral formularioPosdoctoral = formularioPosdoctoralService.encontrarFORMBONEstudioPosdoctoral(formulario.getIdFormulario());
                model.addAttribute("formularioEspecifico", formularioPosdoctoral);
                ruta = Constantes.FBESTUDIOPOSRUTA;
                break;
            case Constantes.FBOTRAREVIS:
                FORMBONOtrasRevistas formularioOtraRevista = formularioOtrasRevistasService.encontrarFORMBONOtrasRevistas(formulario.getIdFormulario());
                model.addAttribute("formularioEspecifico", formularioOtraRevista);
                ruta = Constantes.FBOTRAREVISRUTA;
                break;
            case Constantes.FBPONENCIA:
                FORMBONPonencia formularioPonencia = formularioPonenciaService.encontrarFORMBONPonencia(formulario.getIdFormulario());
                model.addAttribute("formularioEspecifico", formularioPonencia);
                ruta = Constantes.FBPONENCIARUTA;
                break;
            case Constantes.FPAARTICULO:
                FORMPAArticulos formularioArticulos = formularioArticulosService.encontrarFORMPAArticulos(formulario.getIdFormulario());
                model.addAttribute("formularioEspecifico", formularioArticulos);
                ruta = Constantes.FPAARTICULORUTA;
                break;
            case Constantes.FPAAUDIOV:
                FORMPAAudiovisuales formularioAudiovisuales = formularioAudiovisualService.encontrarFORMPAAudiovisuales(formulario.getIdFormulario());
                model.addAttribute("formularioEspecifico", formularioAudiovisuales);
                ruta = Constantes.FPAAUDIOVRUTA;
                break;
            case Constantes.FPALIBROE:
                FORMPALibroEnsayo formularioLibroEnsayo = formularioLibroEnsayoService.encontrarFORMPALibroEnsayo(formulario.getIdFormulario());
                model.addAttribute("formularioEspecifico", formularioLibroEnsayo);
                ruta = Constantes.FPALIBROERUTA;
                break;
            case Constantes.FPALIBROI:
                FORMPALibroInvestigacion formularioLibroInvestigacion = formularioLibroInvestigacionService.encontrarFORMPALibroInvestigacion(formulario.getIdFormulario());
                model.addAttribute("formularioEspecifico", formularioLibroInvestigacion);
                ruta = Constantes.FPALIBROIRUTA;
                break;
            case Constantes.FPALIBROT:
                FORMPALibroTexto formularioLibroTexto = formularioLibroTextoService.encontrarFORMPALibroTexto(formulario.getIdFormulario());
                model.addAttribute("formularioEspecifico", formularioLibroTexto);
                ruta = Constantes.FPALIBROTRUTA;
                break;
            case Constantes.FPAOBRAARTIS:
                FORMPAObraArtistica formularioObraArtistica = formularioObraArtisticaService.encontrarFORMPAObraArtistica(formulario.getIdFormulario());
                model.addAttribute("formularioEspecifico", formularioObraArtistica);
                ruta = Constantes.FPAOBRAARTISRUTA;
                break;
            case Constantes.FPAPATENTE:
                FORMPAPatente formularioPatente = formularioPatenteService.encontrarFORMPAPatente(formulario.getIdFormulario());
                model.addAttribute("formularioEspecifico", formularioPatente);
                ruta = Constantes.FPAPATENTERUTA;
                break;
            case Constantes.FPAPRODTEC:
                FORMPAProduccionTecnica formularioProduccionTecnica = formularioProduccionTecnicaService.encontrarFORMPAProduccionTecnica(formulario.getIdFormulario());
                model.addAttribute("formularioEspecifico", formularioProduccionTecnica);
                ruta = Constantes.FPAPRODTECRUTA;
                break;
            case Constantes.FPASOFT:
                FORMPASoftware formularioSoftware = formularioSoftwareService.encontrarFORMPASoftware(formulario.getIdFormulario());
                model.addAttribute("formularioEspecifico", formularioSoftware);
                ruta = Constantes.FPASOFTRUTA;
                break;
            case Constantes.FPAVALLIBROT:
                FORMPAValLibroTexto formularioValLibroTexto = formularioValLibroTextoService.encontrarFORMPAValLibroTexto(formulario.getIdFormulario());
                model.addAttribute("formularioEspecifico", formularioValLibroTexto);
                ruta = Constantes.FPAVALLIBROTRUTA;
                break;

            default:
                log.error("No se encuentra una ruta para el codigo del formuario enviado");
                throw new AssertionError();
        }

        return ruta;
    }

    @PostMapping("/guardarFormulario")
    public String guardar(@Validated Formulario formulario, Errors errores) {

        formularioService.guardar(formulario);
        return "redirect:/observarFormulario/" + formulario.getIdFormulario();
    }

    @PostMapping("/guardarFormularioPosdoctoral")
    public String guardar(@Validated FORMBONEstudioPosdoctoral formularioEspecifico, Errors errores) {

        formularioPosdoctoralService.guardar(formularioEspecifico);
        return "redirect:/observarFormulario/" + formularioEspecifico.getIdFormulario();
    }

    @PostMapping("/guardarFormularioArticulos")
    public String guardar(@Validated FORMPAArticulos formularioEspecifico, Errors errores) {

        formularioArticulosService.guardar(formularioEspecifico);
        return "redirect:/observarFormulario/" + formularioEspecifico.getIdFormulario();
    }

    @PostMapping("/guardarFormularioDireccionTesis")
    public String guardar(@Validated FORMBONDireccionTesis formularioEspecifico, Errors errores) {

        formularioDireccionTesisService.guardar(formularioEspecifico);
        return "redirect:/observarFormulario/" + formularioEspecifico.getIdFormulario();
    }

    @PostMapping("/guardarFormularioOtrasRevistas")
    public String guardar(@Validated FORMBONOtrasRevistas formularioEspecifico, Errors errores) {

        formularioOtrasRevistasService.guardar(formularioEspecifico);
        return "redirect:/observarFormulario/" + formularioEspecifico.getIdFormulario();
    }

    @PostMapping("/guardarFormularioPonencia")
    public String guardar(@Validated FORMBONPonencia formularioEspecifico, Errors errores) {

        formularioPonenciaService.guardar(formularioEspecifico);
        return "redirect:/observarFormulario/" + formularioEspecifico.getIdFormulario();
    }

    @PostMapping("/guardarFormularioArticulosU")
    public String guardar(@Validated FORMBONArticulosU formularioEspecifico, Errors errores) {

        formularioArticulosUService.guardar(formularioEspecifico);
        return "redirect:/observarFormulario/" + formularioEspecifico.getIdFormulario();
    }

    @PostMapping("/guardarFormularioAudiovisuales")
    public String guardar(@Validated FORMPAAudiovisuales formularioEspecifico, Errors errores) {

        formularioAudiovisualService.guardar(formularioEspecifico);
        return "redirect:/observarFormulario/" + formularioEspecifico.getIdFormulario();
    }

    @PostMapping("/guardarFormularioLibroEnsayo")
    public String guardar(@Validated FORMPALibroEnsayo formularioEspecifico, Errors errores) {

        formularioLibroEnsayoService.guardar(formularioEspecifico);
        return "redirect:/observarFormulario/" + formularioEspecifico.getIdFormulario();
    }

    @PostMapping("/guardarFormularioLibroInvestigacion")
    public String guardar(@Validated FORMPALibroInvestigacion formularioEspecifico, Errors errores) {

        formularioLibroInvestigacionService.guardar(formularioEspecifico);
        return "redirect:/observarFormulario/" + formularioEspecifico.getIdFormulario();
    }

    @PostMapping("/guardarFormularioLibroTexto")
    public String guardar(@Validated FORMPALibroTexto formularioEspecifico, Errors errores) {

        formularioLibroTextoService.guardar(formularioEspecifico);
        return "redirect:/observarFormulario/" + formularioEspecifico.getIdFormulario();
    }

    @PostMapping("/guardarFormularioObraArtistica")
    public String guardar(@Validated FORMPAObraArtistica formularioEspecifico, Errors errores) {

        formularioObraArtisticaService.guardar(formularioEspecifico);
        return "redirect:/observarFormulario/" + formularioEspecifico.getIdFormulario();
    }

    @PostMapping("/guardarFormularioPatente")
    public String guardar(@Validated FORMPAPatente formularioEspecifico, Errors errores) {

        formularioPatenteService.guardar(formularioEspecifico);
        return "redirect:/observarFormulario/" + formularioEspecifico.getIdFormulario();
    }

    @PostMapping("/guardarFormularioProduccionTecnica")
    public String guardar(@Validated FORMPAProduccionTecnica formularioEspecifico, Errors errores) {

        formularioProduccionTecnicaService.guardar(formularioEspecifico);
        return "redirect:/observarFormulario/" + formularioEspecifico.getIdFormulario();
    }

    @PostMapping("/guardarFormularioSoftware")
    public String guardar(@Validated FORMPASoftware formularioEspecifico, Errors errores) {

        formularioSoftwareService.guardar(formularioEspecifico);
        return "redirect:/observarFormulario/" + formularioEspecifico.getIdFormulario();
    }

    @PostMapping("/guardarFormularioValLibroTexto")
    public String guardar(@Validated FORMPAValLibroTexto formularioEspecifico, Errors errores) {

        formularioValLibroTextoService.guardar(formularioEspecifico);
        return "redirect:/observarFormulario/" + formularioEspecifico.getIdFormulario();
    }

    @GetMapping("/crearFormularioArticulos/{idPersona}")
    public String crearFormularioArticulos(Persona persona, Model model) {

        List<TipoDifusion> tipoDifusiones = tipoDifusionService.listarTipoDifusiones();
        List<TipoRevista> tipoRevistas = tipoRevistaService.listarTipoRevistas();
        persona = personaService.encontrarPersona(persona);

        model.addAttribute("persona", persona);
        model.addAttribute("tipoDifusiones", tipoDifusiones);
        model.addAttribute("tipoRevistas", tipoRevistas);

        return "crearFormularioArticulos";
    }

    @GetMapping("/crearFormularioDireccionTesis/{idPersona}")
    public String crearFormularioDireccionTesis(Persona persona, Model model) {

        List<TipoTesis> tiposTesis = tipoTesisService.listarTipoTesis();
        persona = personaService.encontrarPersona(persona);

        model.addAttribute("tiposTesis", tiposTesis);
        model.addAttribute("persona", persona);

        return "crearFormularioDireccionTesis";
    }

    @GetMapping("/crearFormularioOtrasRevistas/{idPersona}")
    public String crearFormularioOtrasRevistas(Persona persona, Model model) {

        persona = personaService.encontrarPersona(persona);
        List<TipoDifusion> tipoDifusiones = tipoDifusionService.listarTipoDifusiones();
        List<TipoPublicacion> tipoPublicaciones = tipoPublicacionService.listarTipoPublicaciones();
        List<TipoRevista> tipoRevistas = tipoRevistaService.listarTipoRevistas();
        
        
        model.addAttribute("persona", persona);
        model.addAttribute("tipoDifusiones", tipoDifusiones);
        model.addAttribute("tipoPublicaciones", tipoPublicaciones);
        model.addAttribute("tipoRevistas", tipoRevistas);

        return "crearFormularioOtrasRevistas";
    }

    @GetMapping("/crearFormularioArticulosU/{idPersona}")
    public String crearFormularioArticulosU(Persona persona, Model model) {

        persona = personaService.encontrarPersona(persona);

        model.addAttribute("persona", persona);

        return "crearFormularioArticulosU";
    }

    @GetMapping("/crearFormularioPosdoctoral/{idPersona}")
    public String crearFormularioPosdoctoral(Persona persona, Model model) {

        persona = personaService.encontrarPersona(persona);

        model.addAttribute("persona", persona);

        return "crearFormularioPosdoctoral";
    }

    @GetMapping("/crearFormularioPonencia/{idPersona}")
    public String crearFormularioPonencia(Persona persona, Model model) {

        persona = personaService.encontrarPersona(persona);
        List<TipoDifusion> tipoDifusiones = tipoDifusionService.listarTipoDifusiones();
        
        model.addAttribute("persona", persona);
        model.addAttribute("tipoDifusiones", tipoDifusiones);
        return "crearFormularioPonencia";
    }

    @GetMapping("/crearFormularioValLibroTexto/{idPersona}")
    public String crearFormularioValLibroTexto(Persona persona, Model model) {

        persona = personaService.encontrarPersona(persona);

        model.addAttribute("persona", persona);

        return "crearFormularioValLibroTexto";
    }

    @GetMapping("/crearFormularioAudioVisuales/{idPersona}")
    public String crearFormularioAudioVisuales(Persona persona, Model model) {

        persona = personaService.encontrarPersona(persona);
        List<TipoDifusion> tipoDifusiones = tipoDifusionService.listarTipoDifusiones();
        List<TipoMaterial> tipoMateriales = tipoMaterialService.listarTipoMateriales();
        List<TipoAporte> tipoAportes = tipoAporteService.listarTipoAportes();

        model.addAttribute("tipoAportes", tipoAportes);
        model.addAttribute("tipoMateriales", tipoMateriales);
        model.addAttribute("tipoDifusiones", tipoDifusiones);
        model.addAttribute("persona", persona);

        return "crearFormularioAudioVisuales";
    }

    @GetMapping("/crearFormularioLibroEnsayo/{idPersona}")
    public String crearFormularioLibroEnsayo(Persona persona, Model model) {

        persona = personaService.encontrarPersona(persona);

        model.addAttribute("persona", persona);

        return "crearFormularioLibroEnsayo";
    }

    @GetMapping("/crearFormularioLibroTexto/{idPersona}")
    public String crearFormularioLibroTexto(Persona persona, Model model) {

        persona = personaService.encontrarPersona(persona);

        model.addAttribute("persona", persona);

        return "crearFormularioLibroTexto";
    }

    @GetMapping("/crearFormularioLibroInvestigacion/{idPersona}")
    public String crearFormularioLibroInvestigacion(Persona persona, Model model) {

        persona = personaService.encontrarPersona(persona);

        model.addAttribute("persona", persona);

        return "crearFormularioLibroInvestigacion";
    }

    @GetMapping("/crearFormularioObraArtistica/{idPersona}")
    public String crearFormularioObraArtistica(Persona persona, Model model) {

        persona = personaService.encontrarPersona(persona);
        List<TipoReconocimiento> tipoReconocimientos = tipoReconocimientoService.listarTipoReconocimientos();
        List<TipoObra> tipoObras = tipoObraService.listarTipoObras();

        model.addAttribute("tipoObras", tipoObras);
        model.addAttribute("tipoReconocimientos", tipoReconocimientos);
        model.addAttribute("persona", persona);

        return "crearFormularioObraArtistica";
    }

    @GetMapping("/crearFormularioPatente/{idPersona}")
    public String crearFormularioPatente(Persona persona, Model model) {

        persona = personaService.encontrarPersona(persona);
        List<TipoPatente> tipoPatentes = tipoPatenteService.listarTipoPatentes();

        model.addAttribute("persona", persona);
        model.addAttribute("tipoPatentes", tipoPatentes);

        return "crearFormularioPatente";
    }

    @GetMapping("/crearFormularioProduccionTecnica/{idPersona}")
    public String crearFormularioProduccionTecnica(Persona persona, Model model) {

        persona = personaService.encontrarPersona(persona);
        List<TipoProduccion> tipoProducciones = tipoProduccionService.listarTipoProducciones();

        model.addAttribute("persona", persona);
        model.addAttribute("tipoProducciones", tipoProducciones);

        return "crearFormularioProduccionTecnica";
    }

    @GetMapping("/crearFormularioSoftware/{idPersona}")
    public String crearFormularioSoftware(Persona persona, Model model) {

        persona = personaService.encontrarPersona(persona);
        List<TipoProduccion> tipoProducciones = tipoProduccionService.listarTipoProducciones();

        model.addAttribute("persona", persona);
        model.addAttribute("tipoProducciones", tipoProducciones);

        return "crearFormularioSoftware";
    }

    @PostMapping("/agregarFormularioArticulos/{idPersona}")
    public String agregarFormularioArticulos(@Validated Formulario formulario, @Validated FORMPAArticulos formularioEspecifico, Persona persona) {

        persona = personaService.encontrarPersona(persona);

        formularioService.guardar(formulario);

        formularioEspecifico.setIdFormulario(formulario.getIdFormulario());
        formularioArticulosService.guardar(formularioEspecifico);

        solicitudService.construirSolicitud(persona, Constantes.NUEVA, formulario, "002", "0", Constantes.PRODUCTIVIDAD_ACADEMICA);

        return "redirect:/";
    }

    @PostMapping("/agregarFormularioDireccionTesis/{idPersona}")
    public String agregarFormularioDireccionTesis(@Validated Formulario formulario, @Validated FORMBONDireccionTesis formularioEspecifico, Persona persona) {

        persona = personaService.encontrarPersona(persona);

        formularioService.guardar(formulario);

        formularioEspecifico.setIdFormulario(formulario.getIdFormulario());
        formularioDireccionTesisService.guardar(formularioEspecifico);

        solicitudService.construirSolicitud(persona, Constantes.NUEVA, formulario, "002", "0", Constantes.BONIFICACION);

        return "redirect:/";
    }

    @PostMapping("/agregarFormularioSoftware/{idPersona}")
    public String agregarFormularioSoftware(@Validated Formulario formulario, @Validated FORMPASoftware formularioEspecifico, Persona persona) {

        persona = personaService.encontrarPersona(persona);

        formularioService.guardar(formulario);

        formularioEspecifico.setIdFormulario(formulario.getIdFormulario());
        formularioSoftwareService.guardar(formularioEspecifico);

        solicitudService.construirSolicitud(persona, Constantes.NUEVA, formulario, "002", "0", Constantes.PRODUCTIVIDAD_ACADEMICA);

        return "redirect:/";
    }

    @PostMapping("/agregarFormularioProduccionTecnica/{idPersona}")
    public String agregarFormularioProduccionTecnica(@Validated Formulario formulario, @Validated FORMPAProduccionTecnica formularioEspecifico, Persona persona) {

        persona = personaService.encontrarPersona(persona);

        formularioService.guardar(formulario);

        formularioEspecifico.setIdFormulario(formulario.getIdFormulario());
        formularioProduccionTecnicaService.guardar(formularioEspecifico);

        solicitudService.construirSolicitud(persona, Constantes.NUEVA, formulario, "002", "0", Constantes.PRODUCTIVIDAD_ACADEMICA);

        return "redirect:/";
    }

    @PostMapping("/agregarFormularioPatente/{idPersona}")
    public String agregarFormularioPatente(@Validated Formulario formulario, @Validated FORMPAPatente formularioEspecifico, Persona persona) {

        persona = personaService.encontrarPersona(persona);

        formularioService.guardar(formulario);

        formularioEspecifico.setIdFormulario(formulario.getIdFormulario());
        formularioPatenteService.guardar(formularioEspecifico);

        solicitudService.construirSolicitud(persona, Constantes.NUEVA, formulario, "002", "0", Constantes.PRODUCTIVIDAD_ACADEMICA);

        return "redirect:/";
    }

    @PostMapping("/agregarFormularioObraArtistica/{idPersona}")
    public String agregarFormularioObraArtistica(@Validated Formulario formulario, @Validated FORMPAObraArtistica formularioEspecifico, Persona persona) {

        persona = personaService.encontrarPersona(persona);

        formularioService.guardar(formulario);

        formularioEspecifico.setIdFormulario(formulario.getIdFormulario());
        formularioObraArtisticaService.guardar(formularioEspecifico);

        solicitudService.construirSolicitud(persona, Constantes.NUEVA, formulario, "002", "0", Constantes.PRODUCTIVIDAD_ACADEMICA);

        return "redirect:/";
    }

    @PostMapping("/agregarFormularioLibroInvestigacion/{idPersona}")
    public String agregarFormularioLibroInvestigacion(@Validated Formulario formulario, @Validated FORMPALibroInvestigacion formularioEspecifico, Persona persona) {

        persona = personaService.encontrarPersona(persona);

        formularioService.guardar(formulario);

        formularioEspecifico.setIdFormulario(formulario.getIdFormulario());
        formularioLibroInvestigacionService.guardar(formularioEspecifico);

        solicitudService.construirSolicitud(persona, Constantes.NUEVA, formulario, "002", "0", Constantes.PRODUCTIVIDAD_ACADEMICA);

        return "redirect:/";
    }

    @PostMapping("/agregarFormularioLibroTexto/{idPersona}")
    public String agregarFormularioLibroTexto(@Validated Formulario formulario, @Validated FORMPALibroTexto formularioEspecifico, Persona persona) {

        persona = personaService.encontrarPersona(persona);

        formularioService.guardar(formulario);

        formularioEspecifico.setIdFormulario(formulario.getIdFormulario());
        formularioLibroTextoService.guardar(formularioEspecifico);

        solicitudService.construirSolicitud(persona, Constantes.NUEVA, formulario, "002", "0", Constantes.PRODUCTIVIDAD_ACADEMICA);

        return "redirect:/";
    }

    @PostMapping("/agregarFormularioLibroEnsayo/{idPersona}")
    public String agregarFormularioLibroEnsayo(@Validated Formulario formulario, @Validated FORMPALibroEnsayo formularioEspecifico, Persona persona) {

        persona = personaService.encontrarPersona(persona);

        formularioService.guardar(formulario);

        formularioEspecifico.setIdFormulario(formulario.getIdFormulario());
        formularioLibroEnsayoService.guardar(formularioEspecifico);

        solicitudService.construirSolicitud(persona, Constantes.NUEVA, formulario, "002", "0", Constantes.PRODUCTIVIDAD_ACADEMICA);

        return "redirect:/";
    }

    @PostMapping("/agregarFormularioAudioVisuales/{idPersona}")
    public String agregarFormularioAudioVisuales(@Validated Formulario formulario, @Validated FORMPAAudiovisuales formularioEspecifico, Persona persona) {

        persona = personaService.encontrarPersona(persona);

        formularioService.guardar(formulario);

        formularioEspecifico.setIdFormulario(formulario.getIdFormulario());
        formularioAudiovisualService.guardar(formularioEspecifico);

        solicitudService.construirSolicitud(persona, Constantes.NUEVA, formulario, "002", "0", Constantes.PRODUCTIVIDAD_ACADEMICA);

        return "redirect:/";
    }

    @PostMapping("/agregarFormularioValLibroTexto/{idPersona}")
    public String agregarFormularioValLibroTexto(@Validated Formulario formulario, @Validated FORMPAValLibroTexto formularioEspecifico, Persona persona) {

        persona = personaService.encontrarPersona(persona);

        formularioService.guardar(formulario);

        formularioEspecifico.setIdFormulario(formulario.getIdFormulario());
        formularioValLibroTextoService.guardar(formularioEspecifico);

        solicitudService.construirSolicitud(persona, Constantes.NUEVA, formulario, "002", "0", Constantes.PRODUCTIVIDAD_ACADEMICA);

        return "redirect:/";
    }

    @PostMapping("/agregarFormularioOtrasRevistas/{idPersona}")
    public String agregarFormularioOtrasRevistas(@Validated Formulario formulario, @Validated FORMBONOtrasRevistas formularioEspecifico, Persona persona) {

        persona = personaService.encontrarPersona(persona);

        formularioService.guardar(formulario);

        formularioEspecifico.setIdFormulario(formulario.getIdFormulario());
        formularioOtrasRevistasService.guardar(formularioEspecifico);

        solicitudService.construirSolicitud(persona, Constantes.NUEVA, formulario, "002", "0", Constantes.BONIFICACION);

        return "redirect:/";
    }

    @PostMapping("/agregarFormularioArticulosU/{idPersona}")
    public String agregarFormularioArticulosU(@Validated Formulario formulario, @Validated FORMBONArticulosU formularioEspecifico, Persona persona) {

        persona = personaService.encontrarPersona(persona);

        formularioService.guardar(formulario);

        formularioEspecifico.setIdFormulario(formulario.getIdFormulario());
        formularioArticulosUService.guardar(formularioEspecifico);

        solicitudService.construirSolicitud(persona, Constantes.NUEVA, formulario, "002", "0", Constantes.BONIFICACION);

        return "redirect:/";
    }

    @PostMapping("/agregarFormularioPosdoctoral/{idPersona}")
    public String agregarFormularioPosdoctoral(@Validated Formulario formulario, @Validated FORMBONEstudioPosdoctoral formularioEspecifico, Persona persona) {

        persona = personaService.encontrarPersona(persona);

        formularioService.guardar(formulario);

        formularioEspecifico.setIdFormulario(formulario.getIdFormulario());
        formularioPosdoctoralService.guardar(formularioEspecifico);

        solicitudService.construirSolicitud(persona, Constantes.NUEVA, formulario, "002", "0", Constantes.BONIFICACION);

        return "redirect:/";
    }

    @PostMapping("/agregarFormularioPonencia/{idPersona}")
    public String agregarFormularioPonencia(@Validated Formulario formulario, @Validated FORMBONPonencia formularioEspecifico, Persona persona) {

        persona = personaService.encontrarPersona(persona);

        formularioService.guardar(formulario);

        formularioEspecifico.setIdFormulario(formulario.getIdFormulario());
        formularioPonenciaService.guardar(formularioEspecifico);

        solicitudService.construirSolicitud(persona, Constantes.NUEVA, formulario, "002", "0", Constantes.BONIFICACION);

        return "redirect:/";
    }
}
