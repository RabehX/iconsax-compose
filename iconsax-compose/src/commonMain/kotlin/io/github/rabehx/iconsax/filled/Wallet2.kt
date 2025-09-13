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


val Iconsax.Filled.Wallet2: ImageVector
    get() {
        if (_Wallet2 != null) {
            return _Wallet2!!
        }
        _Wallet2 = ImageVector.Builder(
            name = "Filled.Wallet2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 10.969f)
                verticalLineTo(13.029f)
                curveTo(22f, 13.579f, 21.56f, 14.029f, 21f, 14.049f)
                horizontalLineTo(19.04f)
                curveTo(17.96f, 14.049f, 16.97f, 13.259f, 16.88f, 12.179f)
                curveTo(16.82f, 11.549f, 17.06f, 10.959f, 17.48f, 10.549f)
                curveTo(17.85f, 10.169f, 18.36f, 9.949f, 18.92f, 9.949f)
                horizontalLineTo(21f)
                curveTo(21.56f, 9.969f, 22f, 10.419f, 22f, 10.969f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.47f, 15.55f)
                horizontalLineTo(19.04f)
                curveTo(17.14f, 15.55f, 15.54f, 14.12f, 15.38f, 12.3f)
                curveTo(15.29f, 11.26f, 15.67f, 10.22f, 16.43f, 9.48f)
                curveTo(17.07f, 8.82f, 17.96f, 8.45f, 18.92f, 8.45f)
                horizontalLineTo(20.47f)
                curveTo(20.76f, 8.45f, 21f, 8.21f, 20.97f, 7.92f)
                curveTo(20.75f, 5.49f, 19.14f, 3.83f, 16.75f, 3.55f)
                curveTo(16.51f, 3.51f, 16.26f, 3.5f, 16f, 3.5f)
                horizontalLineTo(7f)
                curveTo(6.72f, 3.5f, 6.45f, 3.52f, 6.19f, 3.56f)
                curveTo(3.64f, 3.88f, 2f, 5.78f, 2f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2f, 18.26f, 4.24f, 20.5f, 7f, 20.5f)
                horizontalLineTo(16f)
                curveTo(18.8f, 20.5f, 20.73f, 18.75f, 20.97f, 16.08f)
                curveTo(21f, 15.79f, 20.76f, 15.55f, 20.47f, 15.55f)
                close()
                moveTo(13f, 9.75f)
                horizontalLineTo(7f)
                curveTo(6.59f, 9.75f, 6.25f, 9.41f, 6.25f, 9f)
                curveTo(6.25f, 8.59f, 6.59f, 8.25f, 7f, 8.25f)
                horizontalLineTo(13f)
                curveTo(13.41f, 8.25f, 13.75f, 8.59f, 13.75f, 9f)
                curveTo(13.75f, 9.41f, 13.41f, 9.75f, 13f, 9.75f)
                close()
            }
        }.build()

        return _Wallet2!!
    }

@Suppress("ObjectPropertyName")
private var _Wallet2: ImageVector? = null
