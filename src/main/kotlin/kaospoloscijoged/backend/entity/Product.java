package kaospoloscijoged.backend.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {

  @Id
  @Column(name = "id")
  private String id;

  @Column(name = "name")
  private String name;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "color_id")
  private Color color;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "material_id")
  private Material material;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "size_id")
  private Size size;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "type_id")
  private Type type;

}
