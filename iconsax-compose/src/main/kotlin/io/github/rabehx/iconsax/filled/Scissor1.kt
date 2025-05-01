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


val Iconsax.Filled.Scissor1: ImageVector
    get() {
        if (_Scissor1 != null) {
            return _Scissor1!!
        }
        _Scissor1 = ImageVector.Builder(
            name = "Filled.Scissor1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.5f, 10f)
                curveTo(7.433f, 10f, 9f, 8.433f, 9f, 6.5f)
                curveTo(9f, 4.567f, 7.433f, 3f, 5.5f, 3f)
                curveTo(3.567f, 3f, 2f, 4.567f, 2f, 6.5f)
                curveTo(2f, 8.433f, 3.567f, 10f, 5.5f, 10f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.5f, 21f)
                curveTo(7.433f, 21f, 9f, 19.433f, 9f, 17.5f)
                curveTo(9f, 15.567f, 7.433f, 14f, 5.5f, 14f)
                curveTo(3.567f, 14f, 2f, 15.567f, 2f, 17.5f)
                curveTo(2f, 19.433f, 3.567f, 21f, 5.5f, 21f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.249f, 11.98f)
                lineTo(22.449f, 6.6f)
                curveTo(22.779f, 6.35f, 22.849f, 5.88f, 22.599f, 5.55f)
                curveTo(22.349f, 5.22f, 21.879f, 5.15f, 21.549f, 5.4f)
                lineTo(13.999f, 11.05f)
                lineTo(8.449f, 6.89f)
                curveTo(8.119f, 6.65f, 7.649f, 6.71f, 7.399f, 7.04f)
                curveTo(7.149f, 7.37f, 7.219f, 7.84f, 7.549f, 8.09f)
                lineTo(12.749f, 11.98f)
                lineTo(6.849f, 16.4f)
                curveTo(6.519f, 16.65f, 6.449f, 17.12f, 6.699f, 17.45f)
                curveTo(6.849f, 17.65f, 7.069f, 17.75f, 7.299f, 17.75f)
                curveTo(7.459f, 17.75f, 7.609f, 17.7f, 7.749f, 17.6f)
                lineTo(13.999f, 12.92f)
                lineTo(21.549f, 18.57f)
                curveTo(21.679f, 18.67f, 21.839f, 18.72f, 21.999f, 18.72f)
                curveTo(22.229f, 18.72f, 22.449f, 18.62f, 22.599f, 18.42f)
                curveTo(22.849f, 18.09f, 22.779f, 17.62f, 22.449f, 17.37f)
                lineTo(15.249f, 11.98f)
                close()
            }
        }.build()

        return _Scissor1!!
    }

@Suppress("ObjectPropertyName")
private var _Scissor1: ImageVector? = null
