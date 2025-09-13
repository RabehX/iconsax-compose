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

val Iconsax.Outline.Happyemoji: ImageVector
    get() {
        if (_Happyemoji != null) {
            return _Happyemoji!!
        }
        _Happyemoji = ImageVector.Builder(
            name = "Outline.Happyemoji",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.971f, 22.75f)
                curveTo(6.051f, 22.75f, 1.221f, 17.93f, 1.221f, 12f)
                curveTo(1.221f, 6.07f, 6.051f, 1.25f, 11.971f, 1.25f)
                curveTo(17.891f, 1.25f, 22.721f, 6.07f, 22.721f, 12f)
                curveTo(22.721f, 17.93f, 17.901f, 22.75f, 11.971f, 22.75f)
                close()
                moveTo(11.971f, 2.75f)
                curveTo(6.871f, 2.75f, 2.721f, 6.9f, 2.721f, 12f)
                curveTo(2.721f, 17.1f, 6.871f, 21.25f, 11.971f, 21.25f)
                curveTo(17.071f, 21.25f, 21.221f, 17.1f, 21.221f, 12f)
                curveTo(21.221f, 6.9f, 17.071f, 2.75f, 11.971f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 19.25f)
                curveTo(9.85f, 19.25f, 7.83f, 18.2f, 6.6f, 16.43f)
                curveTo(6.36f, 16.09f, 6.45f, 15.62f, 6.79f, 15.39f)
                curveTo(7.13f, 15.15f, 7.6f, 15.24f, 7.83f, 15.58f)
                curveTo(8.78f, 16.94f, 10.34f, 17.76f, 12f, 17.76f)
                curveTo(13.66f, 17.76f, 15.22f, 16.95f, 16.17f, 15.58f)
                curveTo(16.41f, 15.24f, 16.87f, 15.16f, 17.21f, 15.39f)
                curveTo(17.55f, 15.63f, 17.63f, 16.09f, 17.4f, 16.43f)
                curveTo(16.17f, 18.2f, 14.15f, 19.25f, 12f, 19.25f)
                close()
            }
        }.build()

        return _Happyemoji!!
    }

@Suppress("ObjectPropertyName")
private var _Happyemoji: ImageVector? = null
