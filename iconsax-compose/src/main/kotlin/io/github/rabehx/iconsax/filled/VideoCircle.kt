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

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.VideoCircle: ImageVector
    get() {
        if (_VideoCircle != null) {
            return _VideoCircle!!
        }
        _VideoCircle = ImageVector.Builder(
            name = "Filled.VideoCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                close()
                moveTo(14.66f, 13.73f)
                lineTo(13.38f, 14.47f)
                lineTo(12.1f, 15.21f)
                curveTo(10.45f, 16.16f, 9.1f, 15.38f, 9.1f, 13.48f)
                verticalLineTo(12f)
                verticalLineTo(10.52f)
                curveTo(9.1f, 8.61f, 10.45f, 7.84f, 12.1f, 8.79f)
                lineTo(13.38f, 9.53f)
                lineTo(14.66f, 10.27f)
                curveTo(16.31f, 11.22f, 16.31f, 12.78f, 14.66f, 13.73f)
                close()
            }
        }.build()

        return _VideoCircle!!
    }

@Suppress("ObjectPropertyName")
private var _VideoCircle: ImageVector? = null
