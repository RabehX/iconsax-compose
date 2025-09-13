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


val Iconsax.Filled.Security: ImageVector
    get() {
        if (_Security != null) {
            return _Security!!
        }
        _Security = ImageVector.Builder(
            name = "Filled.Security",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.328f, 5.67f)
                lineTo(6.588f, 17.41f)
                curveTo(6.148f, 17.85f, 5.408f, 17.79f, 5.048f, 17.27f)
                curveTo(3.808f, 15.46f, 3.078f, 13.32f, 3.078f, 11.12f)
                verticalLineTo(6.73f)
                curveTo(3.078f, 5.91f, 3.698f, 4.98f, 4.458f, 4.67f)
                lineTo(10.028f, 2.39f)
                curveTo(11.288f, 1.87f, 12.688f, 1.87f, 13.948f, 2.39f)
                lineTo(17.998f, 4.04f)
                curveTo(18.658f, 4.31f, 18.828f, 5.17f, 18.328f, 5.67f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.27f, 7.042f)
                curveTo(19.92f, 6.492f, 20.91f, 6.962f, 20.91f, 7.812f)
                verticalLineTo(11.122f)
                curveTo(20.91f, 16.012f, 17.36f, 20.592f, 12.51f, 21.932f)
                curveTo(12.18f, 22.022f, 11.82f, 22.022f, 11.48f, 21.932f)
                curveTo(10.06f, 21.532f, 8.74f, 20.862f, 7.61f, 19.982f)
                curveTo(7.13f, 19.612f, 7.08f, 18.912f, 7.5f, 18.482f)
                curveTo(9.68f, 16.252f, 16.06f, 9.752f, 19.27f, 7.042f)
                close()
            }
        }.build()

        return _Security!!
    }

@Suppress("ObjectPropertyName")
private var _Security: ImageVector? = null
