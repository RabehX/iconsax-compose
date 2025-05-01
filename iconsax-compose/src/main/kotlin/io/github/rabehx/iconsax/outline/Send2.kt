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

val Iconsax.Outline.Send2: ImageVector
    get() {
        if (_Send2 != null) {
            return _Send2!!
        }
        _Send2 = ImageVector.Builder(
            name = "Outline.Send2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.221f, 21.63f)
                curveTo(13.041f, 21.63f, 11.371f, 20.8f, 10.051f, 16.83f)
                lineTo(9.331f, 14.67f)
                lineTo(7.171f, 13.95f)
                curveTo(3.211f, 12.63f, 2.381f, 10.96f, 2.381f, 9.78f)
                curveTo(2.381f, 8.61f, 3.211f, 6.93f, 7.171f, 5.6f)
                lineTo(15.661f, 2.77f)
                curveTo(17.781f, 2.06f, 19.551f, 2.27f, 20.641f, 3.35f)
                curveTo(21.731f, 4.43f, 21.941f, 6.21f, 21.231f, 8.33f)
                lineTo(18.401f, 16.82f)
                curveTo(17.071f, 20.8f, 15.401f, 21.63f, 14.221f, 21.63f)
                close()
                moveTo(7.641f, 7.03f)
                curveTo(4.861f, 7.96f, 3.871f, 9.06f, 3.871f, 9.78f)
                curveTo(3.871f, 10.5f, 4.861f, 11.6f, 7.641f, 12.52f)
                lineTo(10.161f, 13.36f)
                curveTo(10.381f, 13.43f, 10.561f, 13.61f, 10.631f, 13.83f)
                lineTo(11.471f, 16.35f)
                curveTo(12.391f, 19.13f, 13.501f, 20.12f, 14.221f, 20.12f)
                curveTo(14.941f, 20.12f, 16.041f, 19.13f, 16.971f, 16.35f)
                lineTo(19.801f, 7.86f)
                curveTo(20.311f, 6.32f, 20.221f, 5.06f, 19.571f, 4.41f)
                curveTo(18.921f, 3.76f, 17.661f, 3.68f, 16.131f, 4.19f)
                lineTo(7.641f, 7.03f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.111f, 14.4f)
                curveTo(9.921f, 14.4f, 9.731f, 14.33f, 9.581f, 14.18f)
                curveTo(9.291f, 13.89f, 9.291f, 13.41f, 9.581f, 13.12f)
                lineTo(13.161f, 9.53f)
                curveTo(13.451f, 9.24f, 13.931f, 9.24f, 14.221f, 9.53f)
                curveTo(14.511f, 9.82f, 14.511f, 10.3f, 14.221f, 10.59f)
                lineTo(10.641f, 14.18f)
                curveTo(10.501f, 14.33f, 10.301f, 14.4f, 10.111f, 14.4f)
                close()
            }
        }.build()

        return _Send2!!
    }

@Suppress("ObjectPropertyName")
private var _Send2: ImageVector? = null
