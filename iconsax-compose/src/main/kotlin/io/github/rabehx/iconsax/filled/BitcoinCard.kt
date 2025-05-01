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


val Iconsax.Filled.BitcoinCard: ImageVector
    get() {
        if (_BitcoinCard != null) {
            return _BitcoinCard!!
        }
        _BitcoinCard = ImageVector.Builder(
            name = "Filled.BitcoinCard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.38f, 10.75f)
                curveTo(17.38f, 10.53f, 17.14f, 10.25f, 16.88f, 10.25f)
                horizontalLineTo(14.94f)
                horizontalLineTo(14.5f)
                verticalLineTo(11.25f)
                horizontalLineTo(16.88f)
                curveTo(17.15f, 11.25f, 17.38f, 11.03f, 17.38f, 10.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.32f, 12.75f)
                horizontalLineTo(16.87f)
                horizontalLineTo(14.5f)
                verticalLineTo(13.75f)
                horizontalLineTo(14.94f)
                horizontalLineTo(17.32f)
                curveTo(17.69f, 13.75f, 18f, 13.52f, 18f, 13.25f)
                curveTo(18f, 12.98f, 17.69f, 12.75f, 17.32f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.85f, 3.398f)
                horizontalLineTo(6.15f)
                curveTo(3.86f, 3.398f, 2f, 5.248f, 2f, 7.538f)
                verticalLineTo(16.458f)
                curveTo(2f, 18.748f, 3.86f, 20.598f, 6.15f, 20.598f)
                horizontalLineTo(17.85f)
                curveTo(20.14f, 20.598f, 22f, 18.748f, 22f, 16.458f)
                verticalLineTo(7.538f)
                curveTo(22f, 5.248f, 20.14f, 3.398f, 17.85f, 3.398f)
                close()
                moveTo(9.25f, 12.748f)
                horizontalLineTo(5.25f)
                curveTo(4.84f, 12.748f, 4.5f, 12.408f, 4.5f, 11.998f)
                curveTo(4.5f, 11.588f, 4.84f, 11.248f, 5.25f, 11.248f)
                horizontalLineTo(9.25f)
                curveTo(9.66f, 11.248f, 10f, 11.588f, 10f, 11.998f)
                curveTo(10f, 12.408f, 9.66f, 12.748f, 9.25f, 12.748f)
                close()
                moveTo(17.32f, 15.248f)
                horizontalLineTo(16.26f)
                verticalLineTo(15.748f)
                curveTo(16.26f, 16.158f, 15.92f, 16.498f, 15.51f, 16.498f)
                curveTo(15.1f, 16.498f, 14.76f, 16.158f, 14.76f, 15.748f)
                verticalLineTo(15.248f)
                horizontalLineTo(13.75f)
                horizontalLineTo(12.75f)
                curveTo(12.34f, 15.248f, 12f, 14.908f, 12f, 14.498f)
                curveTo(12f, 14.088f, 12.34f, 13.748f, 12.75f, 13.748f)
                horizontalLineTo(13f)
                verticalLineTo(11.998f)
                verticalLineTo(10.248f)
                horizontalLineTo(12.75f)
                curveTo(12.34f, 10.248f, 12f, 9.908f, 12f, 9.498f)
                curveTo(12f, 9.088f, 12.34f, 8.748f, 12.75f, 8.748f)
                horizontalLineTo(13.75f)
                horizontalLineTo(14.76f)
                verticalLineTo(8.248f)
                curveTo(14.76f, 7.838f, 15.1f, 7.498f, 15.51f, 7.498f)
                curveTo(15.92f, 7.498f, 16.26f, 7.838f, 16.26f, 8.248f)
                verticalLineTo(8.748f)
                horizontalLineTo(16.87f)
                curveTo(17.94f, 8.748f, 18.87f, 9.678f, 18.87f, 10.748f)
                curveTo(18.87f, 11.078f, 18.78f, 11.388f, 18.64f, 11.668f)
                curveTo(19.16f, 12.038f, 19.5f, 12.608f, 19.5f, 13.248f)
                curveTo(19.5f, 14.348f, 18.52f, 15.248f, 17.32f, 15.248f)
                close()
            }
        }.build()

        return _BitcoinCard!!
    }

@Suppress("ObjectPropertyName")
private var _BitcoinCard: ImageVector? = null
