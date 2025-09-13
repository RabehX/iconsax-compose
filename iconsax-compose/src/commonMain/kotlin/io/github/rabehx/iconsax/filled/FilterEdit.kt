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


val Iconsax.Filled.FilterEdit: ImageVector
    get() {
        if (_FilterEdit != null) {
            return _FilterEdit!!
        }
        _FilterEdit = ImageVector.Builder(
            name = "Filled.FilterEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.921f, 6.37f)
                curveTo(17.591f, 6.29f, 17.241f, 6.25f, 16.881f, 6.25f)
                curveTo(14.261f, 6.25f, 12.131f, 8.38f, 12.131f, 11f)
                curveTo(12.131f, 11.89f, 12.381f, 12.73f, 12.821f, 13.45f)
                curveTo(13.191f, 14.07f, 13.701f, 14.6f, 14.321f, 14.98f)
                curveTo(15.061f, 15.47f, 15.941f, 15.75f, 16.881f, 15.75f)
                curveTo(18.621f, 15.75f, 20.131f, 14.82f, 20.951f, 13.45f)
                curveTo(21.391f, 12.73f, 21.631f, 11.89f, 21.631f, 11f)
                curveTo(21.631f, 8.74f, 20.051f, 6.84f, 17.921f, 6.37f)
                close()
                moveTo(18.831f, 10.57f)
                lineTo(16.401f, 13f)
                curveTo(16.311f, 13.09f, 16.121f, 13.18f, 15.991f, 13.2f)
                lineTo(15.061f, 13.33f)
                curveTo(14.721f, 13.38f, 14.491f, 13.14f, 14.541f, 12.81f)
                lineTo(14.671f, 11.88f)
                curveTo(14.691f, 11.75f, 14.781f, 11.57f, 14.871f, 11.47f)
                lineTo(16.951f, 9.39f)
                lineTo(17.301f, 9.04f)
                curveTo(17.721f, 8.62f, 18.211f, 8.42f, 18.821f, 9.04f)
                curveTo(19.431f, 9.66f, 19.251f, 10.15f, 18.831f, 10.57f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.58f, 4.02f)
                verticalLineTo(4.98f)
                curveTo(20.58f, 5.39f, 20.11f, 5.64f, 19.74f, 5.45f)
                curveTo(19.28f, 5.21f, 18.79f, 5.03f, 18.27f, 4.91f)
                curveTo(17.83f, 4.8f, 17.36f, 4.75f, 16.88f, 4.75f)
                curveTo(13.43f, 4.75f, 10.63f, 7.55f, 10.63f, 11f)
                curveTo(10.63f, 12.14f, 10.94f, 13.26f, 11.53f, 14.22f)
                curveTo(12.03f, 15.06f, 12.73f, 15.76f, 13.49f, 16.23f)
                curveTo(13.66f, 16.34f, 13.84f, 16.44f, 14.01f, 16.54f)
                curveTo(14.18f, 16.63f, 14.3f, 16.81f, 14.3f, 17f)
                verticalLineTo(19.07f)
                curveTo(14.3f, 19.68f, 13.9f, 20.49f, 13.4f, 20.79f)
                lineTo(12f, 21.7f)
                curveTo(10.7f, 22.51f, 8.91f, 21.6f, 8.91f, 19.98f)
                verticalLineTo(14.63f)
                curveTo(8.91f, 13.92f, 8.51f, 13.01f, 8.11f, 12.51f)
                lineTo(4.32f, 8.47f)
                curveTo(3.82f, 7.96f, 3.42f, 7.05f, 3.42f, 6.45f)
                verticalLineTo(4.12f)
                curveTo(3.42f, 2.91f, 4.32f, 2f, 5.41f, 2f)
                horizontalLineTo(18.59f)
                curveTo(19.68f, 2f, 20.58f, 2.91f, 20.58f, 4.02f)
                close()
            }
        }.build()

        return _FilterEdit!!
    }

@Suppress("ObjectPropertyName")
private var _FilterEdit: ImageVector? = null
