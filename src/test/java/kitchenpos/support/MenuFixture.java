package kitchenpos.support;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import kitchenpos.menu.application.dto.MenuRequestDto;
import kitchenpos.menu.domain.MenuProduct;
import kitchenpos.product.domain.Product;

public class MenuFixture {

    private static final int QUANTITY = 1;

    public static MenuRequestDto 메뉴_생성(final String name,
                                       final BigDecimal price,
                                       final Long menuGroupId,
                                       final Product... products) {
        return new MenuRequestDto(name, price, menuGroupId, makeMenuProducts(products));
    }

    private static List<MenuProduct> makeMenuProducts(final Product[] products) {
        return Arrays.stream(products)
                .map(it -> new MenuProduct(null, it.getId(), QUANTITY))
                .collect(Collectors.toList());
    }

}
