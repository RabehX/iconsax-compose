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


val Iconsax.Filled.ProfileAdd: ImageVector
    get() {
        if (_ProfileAdd != null) {
            return _ProfileAdd!!
        }
        _ProfileAdd = ImageVector.Builder(
            name = "Filled.ProfileAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 2f)
                curveTo(9.38f, 2f, 7.25f, 4.13f, 7.25f, 6.75f)
                curveTo(7.25f, 9.32f, 9.26f, 11.4f, 11.88f, 11.49f)
                curveTo(11.96f, 11.48f, 12.04f, 11.48f, 12.1f, 11.49f)
                curveTo(12.12f, 11.49f, 12.13f, 11.49f, 12.15f, 11.49f)
                curveTo(12.16f, 11.49f, 12.16f, 11.49f, 12.17f, 11.49f)
                curveTo(14.73f, 11.4f, 16.74f, 9.32f, 16.75f, 6.75f)
                curveTo(16.75f, 4.13f, 14.62f, 2f, 12f, 2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.081f, 14.149f)
                curveTo(14.291f, 12.289f, 9.741f, 12.289f, 6.931f, 14.149f)
                curveTo(5.661f, 14.999f, 4.961f, 16.149f, 4.961f, 17.379f)
                curveTo(4.961f, 18.609f, 5.661f, 19.749f, 6.921f, 20.589f)
                curveTo(8.321f, 21.529f, 10.161f, 21.999f, 12.001f, 21.999f)
                curveTo(13.841f, 21.999f, 15.681f, 21.529f, 17.081f, 20.589f)
                curveTo(18.341f, 19.739f, 19.041f, 18.599f, 19.041f, 17.359f)
                curveTo(19.031f, 16.129f, 18.341f, 14.989f, 17.081f, 14.149f)
                close()
                moveTo(14.001f, 18.129f)
                horizontalLineTo(12.751f)
                verticalLineTo(19.379f)
                curveTo(12.751f, 19.789f, 12.411f, 20.129f, 12.001f, 20.129f)
                curveTo(11.591f, 20.129f, 11.251f, 19.789f, 11.251f, 19.379f)
                verticalLineTo(18.129f)
                horizontalLineTo(10.001f)
                curveTo(9.591f, 18.129f, 9.251f, 17.789f, 9.251f, 17.379f)
                curveTo(9.251f, 16.969f, 9.591f, 16.629f, 10.001f, 16.629f)
                horizontalLineTo(11.251f)
                verticalLineTo(15.379f)
                curveTo(11.251f, 14.969f, 11.591f, 14.629f, 12.001f, 14.629f)
                curveTo(12.411f, 14.629f, 12.751f, 14.969f, 12.751f, 15.379f)
                verticalLineTo(16.629f)
                horizontalLineTo(14.001f)
                curveTo(14.411f, 16.629f, 14.751f, 16.969f, 14.751f, 17.379f)
                curveTo(14.751f, 17.789f, 14.411f, 18.129f, 14.001f, 18.129f)
                close()
            }
        }.build()

        return _ProfileAdd!!
    }

@Suppress("ObjectPropertyName")
private var _ProfileAdd: ImageVector? = null
