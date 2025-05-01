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


val Iconsax.Filled.Brush4: ImageVector
    get() {
        if (_Brush4 != null) {
            return _Brush4!!
        }
        _Brush4 = ImageVector.Builder(
            name = "Filled.Brush4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.5f, 19.5f)
                verticalLineTo(18f)
                horizontalLineTo(4.5f)
                curveTo(3.95f, 18f, 3.45f, 17.78f, 3.09f, 17.41f)
                curveTo(2.72f, 17.05f, 2.5f, 16.55f, 2.5f, 16f)
                curveTo(2.5f, 14.97f, 3.3f, 14.11f, 4.31f, 14.01f)
                curveTo(4.37f, 14f, 4.43f, 14f, 4.5f, 14f)
                horizontalLineTo(19.5f)
                curveTo(19.57f, 14f, 19.63f, 14f, 19.69f, 14.01f)
                curveTo(20.17f, 14.05f, 20.59f, 14.26f, 20.91f, 14.59f)
                curveTo(21.32f, 14.99f, 21.54f, 15.56f, 21.49f, 16.18f)
                curveTo(21.4f, 17.23f, 20.45f, 18f, 19.39f, 18f)
                horizontalLineTo(14.5f)
                verticalLineTo(19.5f)
                curveTo(14.5f, 20.88f, 13.38f, 22f, 12f, 22f)
                curveTo(10.62f, 22f, 9.5f, 20.88f, 9.5f, 19.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.191f, 2f)
                horizontalLineTo(13.251f)
                curveTo(12.971f, 2f, 12.751f, 2.22f, 12.751f, 2.5f)
                verticalLineTo(4f)
                curveTo(12.751f, 4.41f, 12.411f, 4.75f, 12.001f, 4.75f)
                curveTo(11.911f, 4.75f, 11.831f, 4.73f, 11.751f, 4.7f)
                curveTo(11.461f, 4.6f, 11.251f, 4.32f, 11.251f, 4f)
                verticalLineTo(2.5f)
                curveTo(11.251f, 2.22f, 11.031f, 2f, 10.751f, 2f)
                horizontalLineTo(9.241f)
                curveTo(8.961f, 2f, 8.741f, 2.22f, 8.741f, 2.5f)
                verticalLineTo(7f)
                curveTo(8.741f, 7.41f, 8.401f, 7.75f, 7.991f, 7.75f)
                curveTo(7.581f, 7.75f, 7.241f, 7.41f, 7.241f, 7f)
                verticalLineTo(4.75f)
                verticalLineTo(2.5f)
                curveTo(7.241f, 2.23f, 7.041f, 2.02f, 6.771f, 2f)
                horizontalLineTo(6.741f)
                curveTo(5.001f, 2.04f, 3.651f, 3.55f, 3.831f, 5.3f)
                lineTo(4.201f, 12.05f)
                curveTo(4.231f, 12.58f, 4.671f, 13f, 5.201f, 13f)
                horizontalLineTo(18.801f)
                curveTo(19.331f, 13f, 19.771f, 12.58f, 19.801f, 12.05f)
                lineTo(20.171f, 5.3f)
                curveTo(20.351f, 3.53f, 18.961f, 2f, 17.191f, 2f)
                close()
            }
        }.build()

        return _Brush4!!
    }

@Suppress("ObjectPropertyName")
private var _Brush4: ImageVector? = null
