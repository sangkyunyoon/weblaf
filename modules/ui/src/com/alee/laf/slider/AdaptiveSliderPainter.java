package com.alee.laf.slider;

import com.alee.extended.painter.AdaptivePainter;
import com.alee.extended.painter.Painter;

import javax.swing.*;

/**
 * Simple SliderPainter adapter class.
 * It is used to install simple non-specific painters into WebSliderUI.
 *
 * @author Alexandr Zernov
 */

public class AdaptiveSliderPainter<E extends JSlider, U extends WebSliderUI> extends AdaptivePainter<E, U> implements SliderPainter<E, U>
{
    /**
     * Constructs new AdaptiveSliderPainter for the specified painter.
     *
     * @param painter painter to adapt
     */
    public AdaptiveSliderPainter ( final Painter painter )
    {
        super ( painter );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setDragging ( final boolean dragging )
    {
        // Ignore this method in adaptive class
    }
}
