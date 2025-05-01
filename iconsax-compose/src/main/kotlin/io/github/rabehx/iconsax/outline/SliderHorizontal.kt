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

val Iconsax.Outline.SliderHorizontal: ImageVector
    get() {
        if (_SliderHorizontal != null) {
            return _SliderHorizontal!!
        }
        _SliderHorizontal = ImageVector.Builder(
            name = "Outline.SliderHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 22.25f)
                horizontalLineTo(10f)
                curveTo(6.7f, 22.25f, 4.71f, 21.59f, 4.34f, 18.24f)
                curveTo(4.28f, 17.79f, 4.25f, 17.25f, 4.25f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(4.25f, 6.75f, 4.28f, 6.2f, 4.35f, 5.73f)
                curveTo(4.71f, 2.41f, 6.7f, 1.75f, 10f, 1.75f)
                horizontalLineTo(14f)
                curveTo(17.3f, 1.75f, 19.29f, 2.41f, 19.66f, 5.76f)
                curveTo(19.72f, 6.21f, 19.75f, 6.75f, 19.75f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(19.75f, 17.25f, 19.72f, 17.8f, 19.65f, 18.27f)
                curveTo(19.29f, 21.59f, 17.3f, 22.25f, 14f, 22.25f)
                close()
                moveTo(10f, 3.25f)
                curveTo(6.69f, 3.25f, 6.06f, 3.92f, 5.83f, 5.92f)
                curveTo(5.78f, 6.34f, 5.75f, 6.82f, 5.75f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(5.75f, 17.18f, 5.78f, 17.66f, 5.83f, 18.05f)
                curveTo(6.05f, 20.08f, 6.69f, 20.75f, 10f, 20.75f)
                horizontalLineTo(14f)
                curveTo(17.31f, 20.75f, 17.94f, 20.08f, 18.17f, 18.08f)
                curveTo(18.23f, 17.66f, 18.25f, 17.18f, 18.25f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(18.25f, 6.82f, 18.22f, 6.34f, 18.17f, 5.95f)
                curveTo(17.95f, 3.92f, 17.31f, 3.25f, 14f, 3.25f)
                horizontalLineTo(10f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2f, 20.25f)
                curveTo(1.59f, 20.25f, 1.25f, 19.91f, 1.25f, 19.5f)
                verticalLineTo(4.5f)
                curveTo(1.25f, 4.09f, 1.59f, 3.75f, 2f, 3.75f)
                curveTo(2.41f, 3.75f, 2.75f, 4.09f, 2.75f, 4.5f)
                verticalLineTo(19.5f)
                curveTo(2.75f, 19.91f, 2.41f, 20.25f, 2f, 20.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 19.75f)
                curveTo(21.59f, 19.75f, 21.25f, 19.41f, 21.25f, 19f)
                verticalLineTo(4f)
                curveTo(21.25f, 3.59f, 21.59f, 3.25f, 22f, 3.25f)
                curveTo(22.41f, 3.25f, 22.75f, 3.59f, 22.75f, 4f)
                verticalLineTo(19f)
                curveTo(22.75f, 19.41f, 22.41f, 19.75f, 22f, 19.75f)
                close()
            }
        }.build()

        return _SliderHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _SliderHorizontal: ImageVector? = null
