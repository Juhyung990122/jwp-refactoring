package kitchenpos.menu.presentation.dto;

import java.math.BigDecimal;
import java.util.List;
import kitchenpos.menu.application.dto.MenuGroupRequestDto;
import kitchenpos.menu.application.dto.MenuRequestDto;
import kitchenpos.menu.domain.MenuProduct;

public class MenuRequest {

    private String name;
    private BigDecimal price;
    private Long menuGroupId;
    private List<MenuProduct> menuProducts;

    public MenuRequest(final String name,
                       final BigDecimal price,
                       final Long menuGroupId,
                       final List<MenuProduct> menuProducts) {
        this.name = name;
        this.price = price;
        this.menuGroupId = menuGroupId;
        this.menuProducts = menuProducts;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Long getMenuGroupId() {
        return menuGroupId;
    }

    public List<MenuProduct> getMenuProducts() {
        return menuProducts;
    }

    public MenuRequestDto toServiceDto(){
        return new MenuRequestDto(name, price, menuGroupId, menuProducts);
    }
}