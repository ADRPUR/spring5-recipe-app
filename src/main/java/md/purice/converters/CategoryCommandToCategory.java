package md.purice.converters;

import lombok.Synchronized;
import md.purice.commands.CategoryCommand;
import md.purice.domain.Category;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class CategoryCommandToCategory implements Converter<CategoryCommand, Category> {

    @Synchronized
    @Nullable
    @Override
    public Category convert(CategoryCommand source) {
        if(source == null){
            return null;
        }

        final Category category = new Category();
        category.setId((source.getId()));
        category.setDescription(source.getDescription());
        return category;
    }
}
