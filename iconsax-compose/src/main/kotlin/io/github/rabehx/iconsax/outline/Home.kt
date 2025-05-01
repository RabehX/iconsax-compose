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

val Iconsax.Outline.Home: ImageVector
    get() {
        if (_Home != null) {
            return _Home!!
        }
        _Home = ImageVector.Builder(
            name = "Outline.Home",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 18.75f)
                curveTo(11.59f, 18.75f, 11.25f, 18.41f, 11.25f, 18f)
                verticalLineTo(15f)
                curveTo(11.25f, 14.59f, 11.59f, 14.25f, 12f, 14.25f)
                curveTo(12.41f, 14.25f, 12.75f, 14.59f, 12.75f, 15f)
                verticalLineTo(18f)
                curveTo(12.75f, 18.41f, 12.41f, 18.75f, 12f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.601f, 22.56f)
                horizontalLineTo(6.401f)
                curveTo(4.581f, 22.56f, 2.921f, 21.16f, 2.621f, 19.37f)
                lineTo(1.291f, 11.4f)
                curveTo(1.071f, 10.16f, 1.681f, 8.57f, 2.671f, 7.78f)
                lineTo(9.601f, 2.23f)
                curveTo(10.941f, 1.15f, 13.051f, 1.16f, 14.401f, 2.24f)
                lineTo(21.331f, 7.78f)
                curveTo(22.311f, 8.57f, 22.911f, 10.16f, 22.711f, 11.4f)
                lineTo(21.381f, 19.36f)
                curveTo(21.081f, 21.13f, 19.381f, 22.56f, 17.601f, 22.56f)
                close()
                moveTo(11.991f, 2.93f)
                curveTo(11.461f, 2.93f, 10.931f, 3.09f, 10.541f, 3.4f)
                lineTo(3.611f, 8.96f)
                curveTo(3.051f, 9.41f, 2.651f, 10.45f, 2.771f, 11.16f)
                lineTo(4.101f, 19.12f)
                curveTo(4.281f, 20.17f, 5.331f, 21.06f, 6.401f, 21.06f)
                horizontalLineTo(17.601f)
                curveTo(18.671f, 21.06f, 19.721f, 20.17f, 19.901f, 19.11f)
                lineTo(21.231f, 11.15f)
                curveTo(21.341f, 10.45f, 20.941f, 9.39f, 20.391f, 8.95f)
                lineTo(13.461f, 3.41f)
                curveTo(13.061f, 3.09f, 12.521f, 2.93f, 11.991f, 2.93f)
                close()
            }
        }.build()

        return _Home!!
    }

@Suppress("ObjectPropertyName")
private var _Home: ImageVector? = null
