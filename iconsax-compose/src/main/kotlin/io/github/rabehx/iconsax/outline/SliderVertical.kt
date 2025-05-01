/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.SliderVertical: ImageVector
    get() {
        if (_SliderVertical != null) {
            return _SliderVertical!!
        }
        _SliderVertical = ImageVector.Builder(
            name = "Outline.SliderVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.5f, 19.75f)
                horizontalLineTo(7.5f)
                curveTo(6.75f, 19.75f, 6.2f, 19.72f, 5.73f, 19.65f)
                curveTo(2.41f, 19.29f, 1.75f, 17.3f, 1.75f, 14f)
                verticalLineTo(10f)
                curveTo(1.75f, 6.7f, 2.41f, 4.71f, 5.76f, 4.34f)
                curveTo(6.2f, 4.28f, 6.75f, 4.25f, 7.5f, 4.25f)
                horizontalLineTo(16.5f)
                curveTo(17.25f, 4.25f, 17.8f, 4.28f, 18.27f, 4.35f)
                curveTo(21.6f, 4.72f, 22.25f, 6.7f, 22.25f, 10f)
                verticalLineTo(14f)
                curveTo(22.25f, 17.3f, 21.59f, 19.29f, 18.24f, 19.66f)
                curveTo(17.8f, 19.72f, 17.25f, 19.75f, 16.5f, 19.75f)
                close()
                moveTo(7.5f, 5.75f)
                curveTo(6.82f, 5.75f, 6.34f, 5.78f, 5.95f, 5.83f)
                curveTo(3.92f, 6.06f, 3.25f, 6.69f, 3.25f, 10f)
                verticalLineTo(14f)
                curveTo(3.25f, 17.31f, 3.92f, 17.94f, 5.92f, 18.17f)
                curveTo(6.34f, 18.23f, 6.82f, 18.25f, 7.5f, 18.25f)
                horizontalLineTo(16.5f)
                curveTo(17.18f, 18.25f, 17.66f, 18.22f, 18.05f, 18.17f)
                curveTo(20.08f, 17.95f, 20.75f, 17.31f, 20.75f, 14f)
                verticalLineTo(10f)
                curveTo(20.75f, 6.69f, 20.08f, 6.06f, 18.08f, 5.83f)
                curveTo(17.66f, 5.77f, 17.18f, 5.75f, 16.5f, 5.75f)
                horizontalLineTo(7.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.5f, 2.75f)
                horizontalLineTo(4.5f)
                curveTo(4.09f, 2.75f, 3.75f, 2.41f, 3.75f, 2f)
                curveTo(3.75f, 1.59f, 4.09f, 1.25f, 4.5f, 1.25f)
                horizontalLineTo(19.5f)
                curveTo(19.91f, 1.25f, 20.25f, 1.59f, 20.25f, 2f)
                curveTo(20.25f, 2.41f, 19.91f, 2.75f, 19.5f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 22.75f)
                horizontalLineTo(5f)
                curveTo(4.59f, 22.75f, 4.25f, 22.41f, 4.25f, 22f)
                curveTo(4.25f, 21.59f, 4.59f, 21.25f, 5f, 21.25f)
                horizontalLineTo(20f)
                curveTo(20.41f, 21.25f, 20.75f, 21.59f, 20.75f, 22f)
                curveTo(20.75f, 22.41f, 20.41f, 22.75f, 20f, 22.75f)
                close()
            }
        }.build()

        return _SliderVertical!!
    }

@Suppress("ObjectPropertyName")
private var _SliderVertical: ImageVector? = null
