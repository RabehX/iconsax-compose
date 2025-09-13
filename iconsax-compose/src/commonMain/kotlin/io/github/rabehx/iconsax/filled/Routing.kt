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


val Iconsax.Filled.Routing: ImageVector
    get() {
        if (_Routing != null) {
            return _Routing!!
        }
        _Routing = ImageVector.Builder(
            name = "Filled.Routing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.88f, 4.599f)
                curveTo(8.08f, 1.139f, 2.87f, 1.129f, 2.07f, 4.599f)
                curveTo(1.6f, 6.629f, 2.89f, 8.349f, 4.01f, 9.419f)
                curveTo(4.83f, 10.189f, 6.12f, 10.189f, 6.94f, 9.419f)
                curveTo(8.06f, 8.349f, 9.34f, 6.629f, 8.88f, 4.599f)
                close()
                moveTo(5.51f, 6.199f)
                curveTo(4.96f, 6.199f, 4.51f, 5.749f, 4.51f, 5.199f)
                curveTo(4.51f, 4.649f, 4.95f, 4.199f, 5.5f, 4.199f)
                horizontalLineTo(5.51f)
                curveTo(6.07f, 4.199f, 6.51f, 4.649f, 6.51f, 5.199f)
                curveTo(6.51f, 5.749f, 6.07f, 6.199f, 5.51f, 6.199f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.91f, 16.599f)
                curveTo(21.11f, 13.139f, 15.88f, 13.129f, 15.07f, 16.599f)
                curveTo(14.6f, 18.629f, 15.89f, 20.349f, 17.02f, 21.419f)
                curveTo(17.84f, 22.189f, 19.14f, 22.189f, 19.96f, 21.419f)
                curveTo(21.09f, 20.349f, 22.38f, 18.629f, 21.91f, 16.599f)
                close()
                moveTo(18.53f, 18.199f)
                curveTo(17.98f, 18.199f, 17.53f, 17.749f, 17.53f, 17.199f)
                curveTo(17.53f, 16.649f, 17.97f, 16.199f, 18.52f, 16.199f)
                horizontalLineTo(18.53f)
                curveTo(19.08f, 16.199f, 19.53f, 16.649f, 19.53f, 17.199f)
                curveTo(19.53f, 17.749f, 19.08f, 18.199f, 18.53f, 18.199f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 19.75f)
                horizontalLineTo(9.319f)
                curveTo(8.159f, 19.75f, 7.149f, 19.05f, 6.749f, 17.97f)
                curveTo(6.339f, 16.89f, 6.639f, 15.7f, 7.509f, 14.93f)
                lineTo(15.5f, 7.94f)
                curveTo(15.979f, 7.52f, 15.99f, 6.95f, 15.849f, 6.56f)
                curveTo(15.7f, 6.17f, 15.319f, 5.75f, 14.679f, 5.75f)
                horizontalLineTo(12f)
                curveTo(11.59f, 5.75f, 11.25f, 5.41f, 11.25f, 5f)
                curveTo(11.25f, 4.59f, 11.59f, 4.25f, 12f, 4.25f)
                horizontalLineTo(14.679f)
                curveTo(15.84f, 4.25f, 16.85f, 4.95f, 17.25f, 6.03f)
                curveTo(17.66f, 7.11f, 17.36f, 8.3f, 16.49f, 9.07f)
                lineTo(8.499f, 16.06f)
                curveTo(8.019f, 16.48f, 8.009f, 17.05f, 8.149f, 17.44f)
                curveTo(8.299f, 17.83f, 8.679f, 18.25f, 9.319f, 18.25f)
                horizontalLineTo(12f)
                curveTo(12.41f, 18.25f, 12.75f, 18.59f, 12.75f, 19f)
                curveTo(12.75f, 19.41f, 12.41f, 19.75f, 12f, 19.75f)
                close()
            }
        }.build()

        return _Routing!!
    }

@Suppress("ObjectPropertyName")
private var _Routing: ImageVector? = null
