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

val Iconsax.Outline.Grammerly: ImageVector
    get() {
        if (_Grammerly != null) {
            return _Grammerly!!
        }
        _Grammerly = ImageVector.Builder(
            name = "Outline.Grammerly",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.001f, 22.72f)
                curveTo(9.331f, 22.72f, 6.651f, 21.76f, 4.621f, 19.83f)
                curveTo(2.491f, 17.81f, 1.291f, 15.09f, 1.251f, 12.17f)
                curveTo(1.211f, 9.24f, 2.331f, 6.49f, 4.401f, 4.42f)
                curveTo(8.591f, 0.23f, 15.411f, 0.23f, 19.601f, 4.42f)
                curveTo(21.671f, 6.49f, 22.791f, 9.24f, 22.751f, 12.17f)
                curveTo(22.711f, 15.1f, 21.511f, 17.82f, 19.381f, 19.83f)
                curveTo(17.351f, 21.76f, 14.671f, 22.72f, 12.001f, 22.72f)
                close()
                moveTo(12.001f, 2.78f)
                curveTo(9.631f, 2.78f, 7.261f, 3.68f, 5.461f, 5.48f)
                curveTo(3.681f, 7.26f, 2.721f, 9.63f, 2.751f, 12.15f)
                curveTo(2.781f, 14.67f, 3.811f, 17.01f, 5.651f, 18.74f)
                curveTo(9.151f, 22.06f, 14.851f, 22.05f, 18.351f, 18.74f)
                curveTo(20.181f, 17.01f, 21.211f, 14.66f, 21.251f, 12.15f)
                curveTo(21.291f, 9.64f, 20.321f, 7.26f, 18.541f, 5.48f)
                curveTo(16.741f, 3.68f, 14.371f, 2.78f, 12.001f, 2.78f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.001f, 18.32f)
                curveTo(10.421f, 18.32f, 8.851f, 17.75f, 7.651f, 16.62f)
                curveTo(7.351f, 16.33f, 7.341f, 15.86f, 7.621f, 15.56f)
                curveTo(7.911f, 15.26f, 8.381f, 15.25f, 8.681f, 15.53f)
                curveTo(10.511f, 17.26f, 13.491f, 17.26f, 15.321f, 15.53f)
                curveTo(15.621f, 15.25f, 16.101f, 15.26f, 16.381f, 15.56f)
                curveTo(16.661f, 15.86f, 16.651f, 16.34f, 16.351f, 16.62f)
                curveTo(15.151f, 17.75f, 13.581f, 18.32f, 12.001f, 18.32f)
                close()
            }
        }.build()

        return _Grammerly!!
    }

@Suppress("ObjectPropertyName")
private var _Grammerly: ImageVector? = null
