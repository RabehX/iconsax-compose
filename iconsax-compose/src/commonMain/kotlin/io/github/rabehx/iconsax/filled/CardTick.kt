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


val Iconsax.Filled.CardTick: ImageVector
    get() {
        if (_CardTick != null) {
            return _CardTick!!
        }
        _CardTick = ImageVector.Builder(
            name = "Filled.CardTick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 15f)
                curveTo(16.79f, 15f, 15f, 16.79f, 15f, 19f)
                curveTo(15f, 19.75f, 15.21f, 20.46f, 15.58f, 21.06f)
                curveTo(16.27f, 22.22f, 17.54f, 23f, 19f, 23f)
                curveTo(20.46f, 23f, 21.73f, 22.22f, 22.42f, 21.06f)
                curveTo(22.79f, 20.46f, 23f, 19.75f, 23f, 19f)
                curveTo(23f, 16.79f, 21.21f, 15f, 19f, 15f)
                close()
                moveTo(21.07f, 18.57f)
                lineTo(18.94f, 20.54f)
                curveTo(18.8f, 20.67f, 18.61f, 20.74f, 18.43f, 20.74f)
                curveTo(18.24f, 20.74f, 18.05f, 20.67f, 17.9f, 20.52f)
                lineTo(16.91f, 19.53f)
                curveTo(16.62f, 19.24f, 16.62f, 18.76f, 16.91f, 18.47f)
                curveTo(17.2f, 18.18f, 17.68f, 18.18f, 17.97f, 18.47f)
                lineTo(18.45f, 18.95f)
                lineTo(20.05f, 17.47f)
                curveTo(20.35f, 17.19f, 20.83f, 17.21f, 21.11f, 17.51f)
                curveTo(21.39f, 17.81f, 21.37f, 18.28f, 21.07f, 18.57f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 7.548f)
                verticalLineTo(7.998f)
                curveTo(22f, 8.548f, 21.55f, 8.998f, 21f, 8.998f)
                horizontalLineTo(3f)
                curveTo(2.45f, 8.998f, 2f, 8.548f, 2f, 7.998f)
                verticalLineTo(7.538f)
                curveTo(2f, 5.248f, 3.85f, 3.398f, 6.14f, 3.398f)
                horizontalLineTo(17.85f)
                curveTo(20.14f, 3.398f, 22f, 5.258f, 22f, 7.548f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2f, 11.498f)
                verticalLineTo(16.458f)
                curveTo(2f, 18.748f, 3.85f, 20.598f, 6.14f, 20.598f)
                horizontalLineTo(12.4f)
                curveTo(12.98f, 20.598f, 13.48f, 20.108f, 13.43f, 19.528f)
                curveTo(13.29f, 17.998f, 13.78f, 16.338f, 15.14f, 15.018f)
                curveTo(15.7f, 14.468f, 16.39f, 14.048f, 17.14f, 13.808f)
                curveTo(18.39f, 13.408f, 19.6f, 13.458f, 20.67f, 13.818f)
                curveTo(21.32f, 14.038f, 22f, 13.568f, 22f, 12.878f)
                verticalLineTo(11.488f)
                curveTo(22f, 10.938f, 21.55f, 10.488f, 21f, 10.488f)
                horizontalLineTo(3f)
                curveTo(2.45f, 10.498f, 2f, 10.948f, 2f, 11.498f)
                close()
                moveTo(8f, 17.248f)
                horizontalLineTo(6f)
                curveTo(5.59f, 17.248f, 5.25f, 16.908f, 5.25f, 16.498f)
                curveTo(5.25f, 16.088f, 5.59f, 15.748f, 6f, 15.748f)
                horizontalLineTo(8f)
                curveTo(8.41f, 15.748f, 8.75f, 16.088f, 8.75f, 16.498f)
                curveTo(8.75f, 16.908f, 8.41f, 17.248f, 8f, 17.248f)
                close()
            }
        }.build()

        return _CardTick!!
    }

@Suppress("ObjectPropertyName")
private var _CardTick: ImageVector? = null
