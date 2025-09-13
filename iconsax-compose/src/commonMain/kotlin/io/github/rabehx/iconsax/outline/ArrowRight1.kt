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

val Iconsax.Outline.ArrowRight1: ImageVector
    get() {
        if (_ArrowRight1 != null) {
            return _ArrowRight1!!
        }
        _ArrowRight1 = ImageVector.Builder(
            name = "Outline.ArrowRight1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.429f, 18.82f)
                curveTo(14.239f, 18.82f, 14.049f, 18.75f, 13.899f, 18.6f)
                curveTo(13.609f, 18.31f, 13.609f, 17.83f, 13.899f, 17.54f)
                lineTo(19.439f, 12f)
                lineTo(13.899f, 6.46f)
                curveTo(13.609f, 6.17f, 13.609f, 5.69f, 13.899f, 5.4f)
                curveTo(14.189f, 5.11f, 14.669f, 5.11f, 14.959f, 5.4f)
                lineTo(21.029f, 11.47f)
                curveTo(21.319f, 11.76f, 21.319f, 12.24f, 21.029f, 12.53f)
                lineTo(14.959f, 18.6f)
                curveTo(14.809f, 18.75f, 14.619f, 18.82f, 14.429f, 18.82f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.33f, 12.75f)
                horizontalLineTo(3.5f)
                curveTo(3.09f, 12.75f, 2.75f, 12.41f, 2.75f, 12f)
                curveTo(2.75f, 11.59f, 3.09f, 11.25f, 3.5f, 11.25f)
                horizontalLineTo(20.33f)
                curveTo(20.74f, 11.25f, 21.08f, 11.59f, 21.08f, 12f)
                curveTo(21.08f, 12.41f, 20.74f, 12.75f, 20.33f, 12.75f)
                close()
            }
        }.build()

        return _ArrowRight1!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRight1: ImageVector? = null
