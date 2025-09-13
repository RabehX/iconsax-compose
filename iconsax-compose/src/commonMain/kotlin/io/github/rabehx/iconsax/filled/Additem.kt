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

val Iconsax.Filled.Additem: ImageVector
    get() {
        if (_Additem != null) {
            return _Additem!!
        }
        _Additem = ImageVector.Builder(
            name = "Filled.Additem",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.43f, 5.43f)
                verticalLineTo(6.77f)
                curveTo(10.81f, 6.98f, 9.32f, 8.66f, 9.32f, 11.43f)
                verticalLineTo(16f)
                horizontalLineTo(5.43f)
                curveTo(3.14f, 16f, 2f, 14.86f, 2f, 12.57f)
                verticalLineTo(5.43f)
                curveTo(2f, 3.14f, 3.14f, 2f, 5.43f, 2f)
                horizontalLineTo(10f)
                curveTo(12.29f, 2f, 13.43f, 3.14f, 13.43f, 5.43f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.57f, 8f)
                horizontalLineTo(14f)
                curveTo(11.71f, 8f, 10.57f, 9.14f, 10.57f, 11.43f)
                verticalLineTo(18.57f)
                curveTo(10.57f, 20.86f, 11.71f, 22f, 14f, 22f)
                horizontalLineTo(18.57f)
                curveTo(20.86f, 22f, 22f, 20.86f, 22f, 18.57f)
                verticalLineTo(11.43f)
                curveTo(22f, 9.14f, 20.86f, 8f, 18.57f, 8f)
                close()
                moveTo(18.13f, 15.75f)
                horizontalLineTo(17.25f)
                verticalLineTo(16.63f)
                curveTo(17.25f, 17.04f, 16.91f, 17.38f, 16.5f, 17.38f)
                curveTo(16.09f, 17.38f, 15.75f, 17.04f, 15.75f, 16.63f)
                verticalLineTo(15.75f)
                horizontalLineTo(14.87f)
                curveTo(14.46f, 15.75f, 14.12f, 15.41f, 14.12f, 15f)
                curveTo(14.12f, 14.59f, 14.46f, 14.25f, 14.87f, 14.25f)
                horizontalLineTo(15.75f)
                verticalLineTo(13.37f)
                curveTo(15.75f, 12.96f, 16.09f, 12.62f, 16.5f, 12.62f)
                curveTo(16.91f, 12.62f, 17.25f, 12.96f, 17.25f, 13.37f)
                verticalLineTo(14.25f)
                horizontalLineTo(18.13f)
                curveTo(18.54f, 14.25f, 18.88f, 14.59f, 18.88f, 15f)
                curveTo(18.88f, 15.41f, 18.54f, 15.75f, 18.13f, 15.75f)
                close()
            }
        }.build()

        return _Additem!!
    }

@Suppress("ObjectPropertyName")
private var _Additem: ImageVector? = null
