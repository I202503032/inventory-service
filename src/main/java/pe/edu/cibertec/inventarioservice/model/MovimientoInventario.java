package pe.edu.cibertec.inventarioservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Setter
@Getter
@Entity
@Table(name = "movimientos_inventario")
public class MovimientoInventario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false) private String tipo;
    @Column(nullable = false) private int cantidad;
    @Column(nullable = false) private String motivo;
    @Temporal(TemporalType.TIMESTAMP) @Column(nullable = false) private Date fecha = new Date();
    @Column(name = "producto_id", nullable = false) private Integer productoId;
    @Column(name = "usuario_id") private Integer usuarioId;
}
