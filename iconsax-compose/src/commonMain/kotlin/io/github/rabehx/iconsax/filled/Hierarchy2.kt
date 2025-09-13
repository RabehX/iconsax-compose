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


val Iconsax.Filled.Hierarchy2: ImageVector
    get() {
        if (_Hierarchy2 != null) {
            return _Hierarchy2!!
        }
        _Hierarchy2 = ImageVector.Builder(
            name = "Filled.Hierarchy2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.75f, 22f)
                curveTo(20.545f, 22f, 22f, 20.545f, 22f, 18.75f)
                curveTo(22f, 16.955f, 20.545f, 15.5f, 18.75f, 15.5f)
                curveTo(16.955f, 15.5f, 15.5f, 16.955f, 15.5f, 18.75f)
                curveTo(15.5f, 20.545f, 16.955f, 22f, 18.75f, 22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 8f)
                curveTo(20.657f, 8f, 22f, 6.657f, 22f, 5f)
                curveTo(22f, 3.343f, 20.657f, 2f, 19f, 2f)
                curveTo(17.343f, 2f, 16f, 3.343f, 16f, 5f)
                curveTo(16f, 6.657f, 17.343f, 8f, 19f, 8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 8f)
                curveTo(6.657f, 8f, 8f, 6.657f, 8f, 5f)
                curveTo(8f, 3.343f, 6.657f, 2f, 5f, 2f)
                curveTo(3.343f, 2f, 2f, 3.343f, 2f, 5f)
                curveTo(2f, 6.657f, 3.343f, 8f, 5f, 8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.83f, 8.02f)
                curveTo(5.8f, 10.8f, 8.42f, 12.67f, 11.37f, 12.67f)
                curveTo(11.38f, 12.67f, 11.391f, 12.67f, 11.401f, 12.67f)
                lineTo(14.931f, 12.66f)
                curveTo(16.451f, 12.64f, 17.81f, 13.67f, 18.221f, 15.15f)
                verticalLineTo(17f)
                curveTo(18.221f, 17.42f, 18.56f, 17.76f, 18.99f, 17.76f)
                curveTo(19.41f, 17.76f, 19.75f, 17.42f, 19.75f, 17f)
                verticalLineTo(5.76f)
                curveTo(19.75f, 5.34f, 19.41f, 5f, 18.99f, 5f)
                curveTo(18.57f, 5f, 18.221f, 5.34f, 18.221f, 5.76f)
                verticalLineTo(12.38f)
                curveTo(17.34f, 11.6f, 16.191f, 11.12f, 14.941f, 11.12f)
                curveTo(14.931f, 11.12f, 14.931f, 11.12f, 14.92f, 11.12f)
                lineTo(11.391f, 11.13f)
                curveTo(11.38f, 11.13f, 11.38f, 11.13f, 11.37f, 11.13f)
                curveTo(9.08f, 11.13f, 7.03f, 9.68f, 6.28f, 7.51f)
                curveTo(6.16f, 7.2f, 5.87f, 7f, 5.55f, 7f)
                curveTo(5.47f, 7f, 5.38f, 7.02f, 5.3f, 7.04f)
                curveTo(4.9f, 7.18f, 4.69f, 7.62f, 4.83f, 8.02f)
                close()
            }
        }.build()

        return _Hierarchy2!!
    }

@Suppress("ObjectPropertyName")
private var _Hierarchy2: ImageVector? = null
