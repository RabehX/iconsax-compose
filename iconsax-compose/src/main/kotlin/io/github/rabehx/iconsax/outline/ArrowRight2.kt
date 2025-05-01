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

val Iconsax.Outline.ArrowRight2: ImageVector
    get() {
        if (_ArrowRight2 != null) {
            return _ArrowRight2!!
        }
        _ArrowRight2 = ImageVector.Builder(
            name = "Outline.ArrowRight2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12f, 1.25f)
                curveTo(17.93f, 1.25f, 22.75f, 6.07f, 22.75f, 12f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12f, 22.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.5f, 12.75f)
                horizontalLineTo(8.5f)
                curveTo(8.09f, 12.75f, 7.75f, 12.41f, 7.75f, 12f)
                curveTo(7.75f, 11.59f, 8.09f, 11.25f, 8.5f, 11.25f)
                horizontalLineTo(14.5f)
                curveTo(14.91f, 11.25f, 15.25f, 11.59f, 15.25f, 12f)
                curveTo(15.25f, 12.41f, 14.91f, 12.75f, 14.5f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.5f, 15.75f)
                curveTo(12.309f, 15.75f, 12.12f, 15.68f, 11.969f, 15.53f)
                curveTo(11.679f, 15.24f, 11.679f, 14.76f, 11.969f, 14.47f)
                lineTo(14.439f, 12f)
                lineTo(11.969f, 9.53f)
                curveTo(11.679f, 9.24f, 11.679f, 8.76f, 11.969f, 8.47f)
                curveTo(12.259f, 8.18f, 12.74f, 8.18f, 13.03f, 8.47f)
                lineTo(16.029f, 11.47f)
                curveTo(16.319f, 11.76f, 16.319f, 12.24f, 16.029f, 12.53f)
                lineTo(13.03f, 15.53f)
                curveTo(12.88f, 15.68f, 12.689f, 15.75f, 12.5f, 15.75f)
                close()
            }
        }.build()

        return _ArrowRight2!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRight2: ImageVector? = null
