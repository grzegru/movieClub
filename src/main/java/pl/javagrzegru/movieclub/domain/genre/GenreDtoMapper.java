package pl.javagrzegru.movieclub.domain.genre;

import pl.javagrzegru.movieclub.domain.genre.dto.GenreDto;

public class GenreDtoMapper {
    static GenreDto map(Genre genre){
        return new GenreDto(
                genre.getId(),
                genre.getName(),
                genre.getDescription()
        );
    }
}
