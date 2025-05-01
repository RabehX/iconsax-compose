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

val Iconsax.Outline.ArrowLeft: ImageVector
    get() {
        if (_ArrowLeft != null) {
            return _ArrowLeft!!
        }
        _ArrowLeft = ImageVector.Builder(
            name = "Outline.ArrowLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.569f, 18.82f)
                curveTo(9.379f, 18.82f, 9.189f, 18.75f, 9.039f, 18.6f)
                lineTo(2.969f, 12.53f)
                curveTo(2.679f, 12.24f, 2.679f, 11.76f, 2.969f, 11.47f)
                lineTo(9.039f, 5.4f)
                curveTo(9.329f, 5.11f, 9.809f, 5.11f, 10.099f, 5.4f)
                curveTo(10.389f, 5.69f, 10.389f, 6.17f, 10.099f, 6.46f)
                lineTo(4.559f, 12f)
                lineTo(10.099f, 17.54f)
                curveTo(10.389f, 17.83f, 10.389f, 18.31f, 10.099f, 18.6f)
                curveTo(9.959f, 18.75f, 9.759f, 18.82f, 9.569f, 18.82f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.5f, 12.75f)
                horizontalLineTo(3.67f)
                curveTo(3.26f, 12.75f, 2.92f, 12.41f, 2.92f, 12f)
                curveTo(2.92f, 11.59f, 3.26f, 11.25f, 3.67f, 11.25f)
                horizontalLineTo(20.5f)
                curveTo(20.91f, 11.25f, 21.25f, 11.59f, 21.25f, 12f)
                curveTo(21.25f, 12.41f, 20.91f, 12.75f, 20.5f, 12.75f)
                close()
            }
        }.build()

        return _ArrowLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeft: ImageVector? = null
