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

val Iconsax.Filled.BagTimer: ImageVector
    get() {
        if (_BagTimer != null) {
            return _BagTimer!!
        }
        _BagTimer = ImageVector.Builder(
            name = "Filled.BagTimer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.96f, 8.958f)
                curveTo(19.29f, 8.218f, 18.28f, 7.788f, 16.88f, 7.638f)
                verticalLineTo(6.878f)
                curveTo(16.88f, 5.508f, 16.3f, 4.188f, 15.28f, 3.268f)
                curveTo(14.25f, 2.328f, 12.91f, 1.888f, 11.52f, 2.018f)
                curveTo(9.13f, 2.248f, 7.12f, 4.558f, 7.12f, 7.058f)
                verticalLineTo(7.638f)
                curveTo(5.72f, 7.788f, 4.71f, 8.218f, 4.04f, 8.958f)
                curveTo(3.07f, 10.038f, 3.1f, 11.478f, 3.21f, 12.478f)
                lineTo(3.91f, 18.048f)
                curveTo(4.12f, 19.998f, 4.91f, 21.998f, 9.21f, 21.998f)
                horizontalLineTo(14.79f)
                curveTo(19.09f, 21.998f, 19.88f, 19.998f, 20.09f, 18.058f)
                lineTo(20.79f, 12.468f)
                curveTo(20.9f, 11.478f, 20.93f, 10.038f, 19.96f, 8.958f)
                close()
                moveTo(11.66f, 3.408f)
                curveTo(12.66f, 3.318f, 13.61f, 3.628f, 14.35f, 4.298f)
                curveTo(15.08f, 4.958f, 15.49f, 5.898f, 15.49f, 6.878f)
                verticalLineTo(7.578f)
                horizontalLineTo(8.51f)
                verticalLineTo(7.058f)
                curveTo(8.51f, 5.278f, 9.98f, 3.568f, 11.66f, 3.408f)
                close()
                moveTo(12f, 18.578f)
                curveTo(9.91f, 18.578f, 8.21f, 16.878f, 8.21f, 14.788f)
                curveTo(8.21f, 12.698f, 9.91f, 10.998f, 12f, 10.998f)
                curveTo(14.09f, 10.998f, 15.79f, 12.698f, 15.79f, 14.788f)
                curveTo(15.79f, 16.878f, 14.09f, 18.578f, 12f, 18.578f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11f, 16.578f)
                curveTo(10.75f, 16.578f, 10.5f, 16.448f, 10.36f, 16.218f)
                curveTo(10.15f, 15.868f, 10.26f, 15.398f, 10.62f, 15.188f)
                lineTo(11.51f, 14.658f)
                verticalLineTo(13.578f)
                curveTo(11.51f, 13.168f, 11.85f, 12.828f, 12.26f, 12.828f)
                curveTo(12.67f, 12.828f, 13f, 13.158f, 13f, 13.578f)
                verticalLineTo(15.078f)
                curveTo(13f, 15.338f, 12.86f, 15.588f, 12.64f, 15.718f)
                lineTo(11.39f, 16.468f)
                curveTo(11.27f, 16.538f, 11.13f, 16.578f, 11f, 16.578f)
                close()
            }
        }.build()

        return _BagTimer!!
    }

@Suppress("ObjectPropertyName")
private var _BagTimer: ImageVector? = null
