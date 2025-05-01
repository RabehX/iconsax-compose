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


val Iconsax.Filled.CloudFog: ImageVector
    get() {
        if (_CloudFog != null) {
            return _CloudFog!!
        }
        _CloudFog = ImageVector.Builder(
            name = "Filled.CloudFog",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.801f, 12.001f)
                horizontalLineTo(4.201f)
                curveTo(3.981f, 12.001f, 3.781f, 11.851f, 3.711f, 11.641f)
                curveTo(0.961f, 2.551f, 14.841f, -0.939f, 16.451f, 8.821f)
                curveTo(18.111f, 9.031f, 19.421f, 9.971f, 20.231f, 11.231f)
                curveTo(20.441f, 11.561f, 20.191f, 12.001f, 19.801f, 12.001f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 15.781f)
                horizontalLineTo(4f)
                curveTo(3.59f, 15.781f, 3.25f, 15.441f, 3.25f, 15.031f)
                curveTo(3.25f, 14.621f, 3.59f, 14.281f, 4f, 14.281f)
                horizontalLineTo(20f)
                curveTo(20.41f, 14.281f, 20.75f, 14.621f, 20.75f, 15.031f)
                curveTo(20.75f, 15.441f, 20.41f, 15.781f, 20f, 15.781f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 18.781f)
                horizontalLineTo(6f)
                curveTo(5.59f, 18.781f, 5.25f, 18.441f, 5.25f, 18.031f)
                curveTo(5.25f, 17.621f, 5.59f, 17.281f, 6f, 17.281f)
                horizontalLineTo(18f)
                curveTo(18.41f, 17.281f, 18.75f, 17.621f, 18.75f, 18.031f)
                curveTo(18.75f, 18.441f, 18.41f, 18.781f, 18f, 18.781f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 21.781f)
                horizontalLineTo(9f)
                curveTo(8.59f, 21.781f, 8.25f, 21.441f, 8.25f, 21.031f)
                curveTo(8.25f, 20.621f, 8.59f, 20.281f, 9f, 20.281f)
                horizontalLineTo(15f)
                curveTo(15.41f, 20.281f, 15.75f, 20.621f, 15.75f, 21.031f)
                curveTo(15.75f, 21.441f, 15.41f, 21.781f, 15f, 21.781f)
                close()
            }
        }.build()

        return _CloudFog!!
    }

@Suppress("ObjectPropertyName")
private var _CloudFog: ImageVector? = null
