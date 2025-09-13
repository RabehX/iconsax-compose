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


val Iconsax.Filled.Strongbox2: ImageVector
    get() {
        if (_Strongbox2 != null) {
            return _Strongbox2!!
        }
        _Strongbox2 = ImageVector.Builder(
            name = "Filled.Strongbox2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(19f, 8.24f)
                curveTo(19f, 8.79f, 18.55f, 9.24f, 18f, 9.24f)
                horizontalLineTo(16f)
                curveTo(15.59f, 9.24f, 15.25f, 9.58f, 15.25f, 9.99f)
                curveTo(15.25f, 10.41f, 15.59f, 10.74f, 16f, 10.74f)
                horizontalLineTo(18f)
                curveTo(18.55f, 10.74f, 19f, 11.19f, 19f, 11.74f)
                verticalLineTo(12.25f)
                curveTo(19f, 12.8f, 18.55f, 13.25f, 18f, 13.25f)
                horizontalLineTo(16f)
                curveTo(15.59f, 13.25f, 15.25f, 13.59f, 15.25f, 14f)
                curveTo(15.25f, 14.41f, 15.59f, 14.75f, 16f, 14.75f)
                horizontalLineTo(18f)
                curveTo(18.55f, 14.75f, 19f, 15.2f, 19f, 15.75f)
                verticalLineTo(16f)
                curveTo(19f, 17.66f, 17.66f, 19f, 16f, 19f)
                horizontalLineTo(8f)
                curveTo(6.34f, 19f, 5f, 17.66f, 5f, 16f)
                verticalLineTo(15.5f)
                curveTo(5f, 14.95f, 5.45f, 14.5f, 6f, 14.5f)
                horizontalLineTo(7.48f)
                curveTo(8.95f, 14.5f, 10.12f, 13.24f, 9.97f, 11.74f)
                curveTo(9.84f, 10.44f, 8.65f, 9.5f, 7.34f, 9.5f)
                horizontalLineTo(6f)
                curveTo(5.45f, 9.5f, 5f, 9.05f, 5f, 8.5f)
                verticalLineTo(8f)
                curveTo(5f, 6.34f, 6.34f, 5f, 8f, 5f)
                horizontalLineTo(16f)
                curveTo(17.66f, 5f, 19f, 6.34f, 19f, 8f)
                verticalLineTo(8.24f)
                close()
                moveTo(5f, 12f)
                curveTo(5f, 11.45f, 5.45f, 11f, 6f, 11f)
                horizontalLineTo(7f)
                curveTo(7.55f, 11f, 8f, 11.45f, 8f, 12f)
                curveTo(8f, 12.55f, 7.55f, 13f, 7f, 13f)
                horizontalLineTo(6f)
                curveTo(5.45f, 13f, 5f, 12.55f, 5f, 12f)
                close()
            }
        }.build()

        return _Strongbox2!!
    }

@Suppress("ObjectPropertyName")
private var _Strongbox2: ImageVector? = null
