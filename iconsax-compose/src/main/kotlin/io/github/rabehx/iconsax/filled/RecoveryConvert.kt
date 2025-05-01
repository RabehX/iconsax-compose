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


val Iconsax.Filled.RecoveryConvert: ImageVector
    get() {
        if (_RecoveryConvert != null) {
            return _RecoveryConvert!!
        }
        _RecoveryConvert = ImageVector.Builder(
            name = "Filled.RecoveryConvert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.748f)
                curveTo(14.73f, 22.748f, 14.48f, 22.598f, 14.35f, 22.368f)
                curveTo(14.22f, 22.128f, 14.22f, 21.848f, 14.36f, 21.608f)
                lineTo(15.41f, 19.858f)
                curveTo(15.62f, 19.498f, 16.09f, 19.388f, 16.44f, 19.598f)
                curveTo(16.8f, 19.808f, 16.91f, 20.268f, 16.7f, 20.628f)
                lineTo(16.43f, 21.078f)
                curveTo(19.19f, 20.428f, 21.26f, 17.948f, 21.26f, 14.988f)
                curveTo(21.26f, 14.578f, 21.6f, 14.238f, 22.01f, 14.238f)
                curveTo(22.42f, 14.238f, 22.76f, 14.578f, 22.76f, 14.988f)
                curveTo(22.75f, 19.268f, 19.27f, 22.748f, 15f, 22.748f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2f, 9.75f)
                curveTo(1.59f, 9.75f, 1.25f, 9.41f, 1.25f, 9f)
                curveTo(1.25f, 4.73f, 4.73f, 1.25f, 9f, 1.25f)
                curveTo(9.27f, 1.25f, 9.52f, 1.4f, 9.65f, 1.63f)
                curveTo(9.78f, 1.87f, 9.78f, 2.15f, 9.64f, 2.39f)
                lineTo(8.59f, 4.14f)
                curveTo(8.38f, 4.49f, 7.92f, 4.61f, 7.56f, 4.39f)
                curveTo(7.21f, 4.18f, 7.09f, 3.72f, 7.31f, 3.36f)
                lineTo(7.58f, 2.91f)
                curveTo(4.81f, 3.56f, 2.75f, 6.04f, 2.75f, 9f)
                curveTo(2.75f, 9.41f, 2.41f, 9.75f, 2f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.8f, 12.629f)
                verticalLineTo(15.569f)
                curveTo(14.8f, 18.019f, 13.82f, 18.999f, 11.37f, 18.999f)
                horizontalLineTo(8.43f)
                curveTo(5.98f, 18.999f, 5f, 18.019f, 5f, 15.569f)
                verticalLineTo(12.629f)
                curveTo(5f, 10.179f, 5.98f, 9.199f, 8.43f, 9.199f)
                horizontalLineTo(11.37f)
                curveTo(13.82f, 9.199f, 14.8f, 10.179f, 14.8f, 12.629f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.571f, 5f)
                horizontalLineTo(12.631f)
                curveTo(10.221f, 5f, 9.241f, 5.96f, 9.211f, 8.32f)
                horizontalLineTo(11.371f)
                curveTo(14.311f, 8.32f, 15.671f, 9.69f, 15.671f, 12.62f)
                verticalLineTo(14.78f)
                curveTo(18.041f, 14.75f, 18.991f, 13.77f, 18.991f, 11.36f)
                verticalLineTo(8.43f)
                curveTo(19.001f, 5.98f, 18.021f, 5f, 15.571f, 5f)
                close()
            }
        }.build()

        return _RecoveryConvert!!
    }

@Suppress("ObjectPropertyName")
private var _RecoveryConvert: ImageVector? = null
