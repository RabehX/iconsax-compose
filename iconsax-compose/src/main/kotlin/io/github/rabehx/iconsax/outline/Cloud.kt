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

val Iconsax.Outline.Cloud: ImageVector
    get() {
        if (_Cloud != null) {
            return _Cloud!!
        }
        _Cloud = ImageVector.Builder(
            name = "Outline.Cloud",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.679f, 20.83f)
                curveTo(16.669f, 20.83f, 16.649f, 20.83f, 16.639f, 20.83f)
                horizontalLineTo(5.549f)
                curveTo(2.609f, 20.62f, 1.289f, 18.36f, 1.289f, 16.34f)
                curveTo(1.289f, 14.54f, 2.339f, 12.54f, 4.629f, 11.99f)
                curveTo(3.989f, 9.49f, 4.529f, 7.14f, 6.159f, 5.44f)
                curveTo(8.009f, 3.5f, 10.979f, 2.73f, 13.529f, 3.52f)
                curveTo(15.869f, 4.24f, 17.519f, 6.17f, 18.119f, 8.85f)
                curveTo(20.169f, 9.31f, 21.799f, 10.86f, 22.459f, 13f)
                curveTo(23.169f, 15.33f, 22.529f, 17.72f, 20.779f, 19.25f)
                curveTo(19.659f, 20.26f, 18.199f, 20.83f, 16.679f, 20.83f)
                close()
                moveTo(5.569f, 13.35f)
                curveTo(5.559f, 13.35f, 5.559f, 13.35f, 5.549f, 13.35f)
                curveTo(3.649f, 13.49f, 2.779f, 14.95f, 2.779f, 16.34f)
                curveTo(2.779f, 17.73f, 3.649f, 19.19f, 5.589f, 19.33f)
                horizontalLineTo(16.629f)
                curveTo(17.789f, 19.31f, 18.899f, 18.91f, 19.759f, 18.13f)
                curveTo(21.319f, 16.76f, 21.429f, 14.81f, 21.009f, 13.44f)
                curveTo(20.589f, 12.06f, 19.419f, 10.5f, 17.379f, 10.24f)
                curveTo(17.049f, 10.2f, 16.789f, 9.95f, 16.729f, 9.62f)
                curveTo(16.329f, 7.22f, 15.029f, 5.56f, 13.079f, 4.96f)
                curveTo(11.049f, 4.34f, 8.709f, 4.95f, 7.239f, 6.48f)
                curveTo(5.909f, 7.87f, 5.529f, 9.79f, 6.149f, 11.9f)
                curveTo(6.659f, 11.97f, 7.149f, 12.12f, 7.599f, 12.35f)
                curveTo(7.969f, 12.54f, 8.119f, 12.99f, 7.929f, 13.36f)
                curveTo(7.739f, 13.73f, 7.289f, 13.88f, 6.919f, 13.69f)
                curveTo(6.509f, 13.48f, 6.059f, 13.37f, 5.609f, 13.37f)
                curveTo(5.599f, 13.35f, 5.589f, 13.35f, 5.569f, 13.35f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.85f, 10.67f)
                curveTo(15.57f, 10.67f, 15.31f, 10.52f, 15.18f, 10.25f)
                curveTo(14.99f, 9.88f, 15.15f, 9.43f, 15.52f, 9.24f)
                curveTo(16.14f, 8.93f, 16.83f, 8.76f, 17.51f, 8.75f)
                curveTo(17.91f, 8.74f, 18.27f, 9.07f, 18.27f, 9.49f)
                curveTo(18.28f, 9.9f, 17.95f, 10.25f, 17.53f, 10.25f)
                curveTo(17.07f, 10.26f, 16.6f, 10.37f, 16.18f, 10.58f)
                curveTo(16.07f, 10.64f, 15.96f, 10.67f, 15.85f, 10.67f)
                close()
            }
        }.build()

        return _Cloud!!
    }

@Suppress("ObjectPropertyName")
private var _Cloud: ImageVector? = null
