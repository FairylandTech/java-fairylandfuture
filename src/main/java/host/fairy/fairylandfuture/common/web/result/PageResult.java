/*****************************************************
 * @software: IntelliJ IDEA
 * @author: Beau Dean
 * @contact: https://fairy.host
 * @organization: https://github.com/FairylandFuture
 * @datetime: 2025-12-19 18:39:47 UTC+08:00
 ****************************************************/
package host.fairy.fairylandfuture.common.web.result;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author Beau Dean
 * @version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageResult<E> implements Serializable {
    private Long page;
    
    private Long size;
    
    private Long total;
    
    private Long pages;
    
    private List<E> data;
    
    public static <E> PageResult<E> from(Long page, Long size, Long total, Long pages, List<E> data) {
        return PageResult.<E>builder()
                .page(page)
                .size(size)
                .total(total)
                .pages(pages)
                .data(data)
                .build();
    }
}
