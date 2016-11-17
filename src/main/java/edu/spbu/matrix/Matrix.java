package edu.spbu.matrix;

import java.util.Objects;

public interface Matrix
{
    Matrix mul(Matrix o);

    Matrix threadmul(Matrix o);

}
