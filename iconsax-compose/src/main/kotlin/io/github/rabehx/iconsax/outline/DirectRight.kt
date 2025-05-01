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

val Iconsax.Outline.DirectRight: ImageVector
    get() {
        if (_DirectRight != null) {
            return _DirectRight!!
        }
        _DirectRight = ImageVector.Builder(
            name = "Outline.DirectRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.191f, 22.06f)
                curveTo(5.191f, 22.06f, 4.221f, 21.67f, 3.451f, 20.92f)
                curveTo(2.201f, 19.7f, 1.901f, 17.9f, 2.681f, 16.34f)
                lineTo(4.301f, 13.1f)
                curveTo(4.641f, 12.42f, 4.641f, 11.6f, 4.301f, 10.91f)
                lineTo(2.681f, 7.66f)
                curveTo(1.901f, 6.1f, 2.201f, 4.3f, 3.451f, 3.08f)
                curveTo(4.701f, 1.86f, 6.501f, 1.59f, 8.051f, 2.41f)
                lineTo(19.641f, 8.51f)
                curveTo(20.941f, 9.19f, 21.751f, 10.53f, 21.751f, 12f)
                curveTo(21.751f, 13.47f, 20.941f, 14.81f, 19.641f, 15.49f)
                lineTo(8.051f, 21.59f)
                curveTo(7.451f, 21.91f, 6.821f, 22.06f, 6.191f, 22.06f)
                close()
                moveTo(6.201f, 3.44f)
                curveTo(5.511f, 3.44f, 4.911f, 3.76f, 4.501f, 4.16f)
                curveTo(3.881f, 4.76f, 3.441f, 5.83f, 4.021f, 7f)
                lineTo(5.641f, 10.24f)
                curveTo(6.191f, 11.35f, 6.191f, 12.66f, 5.641f, 13.77f)
                lineTo(4.021f, 17.01f)
                curveTo(3.431f, 18.18f, 3.881f, 19.25f, 4.501f, 19.85f)
                curveTo(5.121f, 20.45f, 6.191f, 20.88f, 7.351f, 20.27f)
                lineTo(18.941f, 14.17f)
                curveTo(19.761f, 13.74f, 20.251f, 12.93f, 20.251f, 12.01f)
                curveTo(20.251f, 11.09f, 19.761f, 10.28f, 18.941f, 9.85f)
                lineTo(7.351f, 3.73f)
                curveTo(6.951f, 3.52f, 6.561f, 3.44f, 6.201f, 3.44f)
                close()
            }
        }.build()

        return _DirectRight!!
    }

@Suppress("ObjectPropertyName")
private var _DirectRight: ImageVector? = null
