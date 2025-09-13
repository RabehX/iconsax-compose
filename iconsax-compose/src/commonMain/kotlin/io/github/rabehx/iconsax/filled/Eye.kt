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


val Iconsax.Filled.Eye: ImageVector
    get() {
        if (_Eye != null) {
            return _Eye!!
        }
        _Eye = ImageVector.Builder(
            name = "Filled.Eye",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.25f, 9.15f)
                curveTo(18.94f, 5.52f, 15.56f, 3.43f, 12f, 3.43f)
                curveTo(10.22f, 3.43f, 8.49f, 3.95f, 6.91f, 4.92f)
                curveTo(5.33f, 5.9f, 3.91f, 7.33f, 2.75f, 9.15f)
                curveTo(1.75f, 10.72f, 1.75f, 13.27f, 2.75f, 14.84f)
                curveTo(5.06f, 18.48f, 8.44f, 20.56f, 12f, 20.56f)
                curveTo(13.78f, 20.56f, 15.51f, 20.04f, 17.09f, 19.07f)
                curveTo(18.67f, 18.09f, 20.09f, 16.66f, 21.25f, 14.84f)
                curveTo(22.25f, 13.28f, 22.25f, 10.72f, 21.25f, 9.15f)
                close()
                moveTo(12f, 16.04f)
                curveTo(9.76f, 16.04f, 7.96f, 14.23f, 7.96f, 12f)
                curveTo(7.96f, 9.77f, 9.76f, 7.96f, 12f, 7.96f)
                curveTo(14.24f, 7.96f, 16.04f, 9.77f, 16.04f, 12f)
                curveTo(16.04f, 14.23f, 14.24f, 16.04f, 12f, 16.04f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.998f, 9.141f)
                curveTo(10.428f, 9.141f, 9.148f, 10.421f, 9.148f, 12.001f)
                curveTo(9.148f, 13.571f, 10.428f, 14.851f, 11.998f, 14.851f)
                curveTo(13.568f, 14.851f, 14.858f, 13.571f, 14.858f, 12.001f)
                curveTo(14.858f, 10.431f, 13.568f, 9.141f, 11.998f, 9.141f)
                close()
            }
        }.build()

        return _Eye!!
    }

@Suppress("ObjectPropertyName")
private var _Eye: ImageVector? = null
