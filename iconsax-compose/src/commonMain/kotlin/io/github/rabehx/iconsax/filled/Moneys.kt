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


val Iconsax.Filled.Moneys: ImageVector
    get() {
        if (_Moneys != null) {
            return _Moneys!!
        }
        _Moneys = ImageVector.Builder(
            name = "Filled.Moneys",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.171f, 6.64f)
                curveTo(18.741f, 4.47f, 17.131f, 3.52f, 14.891f, 3.52f)
                horizontalLineTo(6.111f)
                curveTo(3.471f, 3.52f, 1.711f, 4.84f, 1.711f, 7.92f)
                verticalLineTo(13.069f)
                curveTo(1.711f, 15.29f, 2.621f, 16.59f, 4.121f, 17.149f)
                curveTo(4.341f, 17.229f, 4.581f, 17.299f, 4.831f, 17.34f)
                curveTo(5.231f, 17.43f, 5.661f, 17.469f, 6.111f, 17.469f)
                horizontalLineTo(14.901f)
                curveTo(17.541f, 17.469f, 19.301f, 16.149f, 19.301f, 13.069f)
                verticalLineTo(7.92f)
                curveTo(19.301f, 7.45f, 19.261f, 7.03f, 19.171f, 6.64f)
                close()
                moveTo(5.531f, 12f)
                curveTo(5.531f, 12.41f, 5.191f, 12.75f, 4.781f, 12.75f)
                curveTo(4.371f, 12.75f, 4.031f, 12.41f, 4.031f, 12f)
                verticalLineTo(9f)
                curveTo(4.031f, 8.59f, 4.371f, 8.25f, 4.781f, 8.25f)
                curveTo(5.191f, 8.25f, 5.531f, 8.59f, 5.531f, 9f)
                verticalLineTo(12f)
                close()
                moveTo(10.501f, 13.139f)
                curveTo(9.041f, 13.139f, 7.861f, 11.96f, 7.861f, 10.5f)
                curveTo(7.861f, 9.04f, 9.041f, 7.86f, 10.501f, 7.86f)
                curveTo(11.961f, 7.86f, 13.141f, 9.04f, 13.141f, 10.5f)
                curveTo(13.141f, 11.96f, 11.961f, 13.139f, 10.501f, 13.139f)
                close()
                moveTo(16.961f, 12f)
                curveTo(16.961f, 12.41f, 16.621f, 12.75f, 16.211f, 12.75f)
                curveTo(15.801f, 12.75f, 15.461f, 12.41f, 15.461f, 12f)
                verticalLineTo(9f)
                curveTo(15.461f, 8.59f, 15.801f, 8.25f, 16.211f, 8.25f)
                curveTo(16.621f, 8.25f, 16.961f, 8.59f, 16.961f, 9f)
                verticalLineTo(12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22.302f, 10.918f)
                verticalLineTo(16.068f)
                curveTo(22.302f, 19.148f, 20.542f, 20.478f, 17.892f, 20.478f)
                horizontalLineTo(9.112f)
                curveTo(8.362f, 20.478f, 7.692f, 20.368f, 7.112f, 20.148f)
                curveTo(6.642f, 19.978f, 6.232f, 19.728f, 5.902f, 19.408f)
                curveTo(5.722f, 19.238f, 5.862f, 18.968f, 6.112f, 18.968f)
                horizontalLineTo(14.892f)
                curveTo(18.592f, 18.968f, 20.792f, 16.768f, 20.792f, 13.078f)
                verticalLineTo(7.918f)
                curveTo(20.792f, 7.678f, 21.062f, 7.528f, 21.232f, 7.708f)
                curveTo(21.912f, 8.428f, 22.302f, 9.478f, 22.302f, 10.918f)
                close()
            }
        }.build()

        return _Moneys!!
    }

@Suppress("ObjectPropertyName")
private var _Moneys: ImageVector? = null
