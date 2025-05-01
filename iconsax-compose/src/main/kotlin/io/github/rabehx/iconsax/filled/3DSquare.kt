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


val Iconsax.Filled.ThreeDSquare: ImageVector
    get() {
        if (_3DSquare != null) {
            return _3DSquare!!
        }
        _3DSquare = ImageVector.Builder(
            name = "Filled.3DSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2.328f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2.328f, 2f, 4.508f, 2f, 8.148f)
                verticalLineTo(16.518f)
                curveTo(2f, 20.158f, 4.17f, 22.328f, 7.81f, 22.328f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22.328f, 21.99f, 20.158f, 21.99f, 16.518f)
                verticalLineTo(8.148f)
                curveTo(22f, 4.508f, 19.83f, 2.328f, 16.19f, 2.328f)
                close()
                moveTo(11.57f, 17.118f)
                curveTo(11.57f, 17.418f, 11.42f, 17.688f, 11.16f, 17.848f)
                curveTo(11.02f, 17.938f, 10.87f, 17.978f, 10.71f, 17.978f)
                curveTo(10.58f, 17.978f, 10.45f, 17.948f, 10.32f, 17.888f)
                lineTo(6.82f, 16.138f)
                curveTo(6.32f, 15.878f, 6f, 15.368f, 6f, 14.798f)
                verticalLineTo(11.488f)
                curveTo(6f, 11.188f, 6.15f, 10.918f, 6.41f, 10.758f)
                curveTo(6.67f, 10.598f, 6.98f, 10.588f, 7.25f, 10.718f)
                lineTo(10.75f, 12.468f)
                curveTo(11.26f, 12.728f, 11.58f, 13.238f, 11.58f, 13.808f)
                verticalLineTo(17.118f)
                horizontalLineTo(11.57f)
                close()
                moveTo(11.36f, 11.768f)
                lineTo(7.6f, 9.738f)
                curveTo(7.33f, 9.588f, 7.16f, 9.298f, 7.16f, 8.968f)
                curveTo(7.16f, 8.648f, 7.33f, 8.348f, 7.6f, 8.198f)
                lineTo(11.36f, 6.168f)
                curveTo(11.76f, 5.958f, 12.23f, 5.958f, 12.63f, 6.168f)
                lineTo(16.39f, 8.198f)
                curveTo(16.66f, 8.348f, 16.83f, 8.638f, 16.83f, 8.968f)
                curveTo(16.83f, 9.298f, 16.66f, 9.588f, 16.39f, 9.738f)
                lineTo(12.63f, 11.768f)
                curveTo(12.43f, 11.878f, 12.21f, 11.928f, 11.99f, 11.928f)
                curveTo(11.77f, 11.928f, 11.56f, 11.878f, 11.36f, 11.768f)
                close()
                moveTo(18f, 14.798f)
                curveTo(18f, 15.368f, 17.68f, 15.888f, 17.17f, 16.138f)
                lineTo(13.67f, 17.888f)
                curveTo(13.55f, 17.948f, 13.42f, 17.978f, 13.28f, 17.978f)
                curveTo(13.12f, 17.978f, 12.97f, 17.938f, 12.83f, 17.848f)
                curveTo(12.57f, 17.688f, 12.42f, 17.418f, 12.42f, 17.118f)
                verticalLineTo(13.808f)
                curveTo(12.42f, 13.238f, 12.74f, 12.718f, 13.25f, 12.468f)
                lineTo(16.75f, 10.718f)
                curveTo(17.02f, 10.588f, 17.33f, 10.598f, 17.59f, 10.758f)
                curveTo(17.85f, 10.918f, 18f, 11.188f, 18f, 11.488f)
                verticalLineTo(14.798f)
                close()
            }
        }.build()

        return _3DSquare!!
    }

@Suppress("ObjectPropertyName")
private var _3DSquare: ImageVector? = null
