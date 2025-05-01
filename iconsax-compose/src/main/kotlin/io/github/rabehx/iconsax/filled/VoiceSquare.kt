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


val Iconsax.Filled.VoiceSquare: ImageVector
    get() {
        if (_VoiceSquare != null) {
            return _VoiceSquare!!
        }
        _VoiceSquare = ImageVector.Builder(
            name = "Filled.VoiceSquare",
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
                moveTo(6.75f, 14.14f)
                curveTo(6.75f, 14.55f, 6.41f, 14.89f, 6f, 14.89f)
                curveTo(5.59f, 14.89f, 5.25f, 14.55f, 5.25f, 14.14f)
                verticalLineTo(9.86f)
                curveTo(5.25f, 9.45f, 5.59f, 9.11f, 6f, 9.11f)
                curveTo(6.41f, 9.11f, 6.75f, 9.45f, 6.75f, 9.86f)
                verticalLineTo(14.14f)
                close()
                moveTo(9.75f, 15.57f)
                curveTo(9.75f, 15.98f, 9.41f, 16.32f, 9f, 16.32f)
                curveTo(8.59f, 16.32f, 8.25f, 15.98f, 8.25f, 15.57f)
                verticalLineTo(8.43f)
                curveTo(8.25f, 8.02f, 8.59f, 7.68f, 9f, 7.68f)
                curveTo(9.41f, 7.68f, 9.75f, 8.02f, 9.75f, 8.43f)
                verticalLineTo(15.57f)
                close()
                moveTo(12.75f, 17f)
                curveTo(12.75f, 17.41f, 12.41f, 17.75f, 12f, 17.75f)
                curveTo(11.59f, 17.75f, 11.25f, 17.41f, 11.25f, 17f)
                verticalLineTo(7f)
                curveTo(11.25f, 6.59f, 11.59f, 6.25f, 12f, 6.25f)
                curveTo(12.41f, 6.25f, 12.75f, 6.59f, 12.75f, 7f)
                verticalLineTo(17f)
                close()
                moveTo(15.75f, 15.57f)
                curveTo(15.75f, 15.98f, 15.41f, 16.32f, 15f, 16.32f)
                curveTo(14.59f, 16.32f, 14.25f, 15.98f, 14.25f, 15.57f)
                verticalLineTo(8.43f)
                curveTo(14.25f, 8.02f, 14.59f, 7.68f, 15f, 7.68f)
                curveTo(15.41f, 7.68f, 15.75f, 8.02f, 15.75f, 8.43f)
                verticalLineTo(15.57f)
                close()
                moveTo(18.75f, 14.14f)
                curveTo(18.75f, 14.55f, 18.41f, 14.89f, 18f, 14.89f)
                curveTo(17.59f, 14.89f, 17.25f, 14.55f, 17.25f, 14.14f)
                verticalLineTo(9.86f)
                curveTo(17.25f, 9.45f, 17.59f, 9.11f, 18f, 9.11f)
                curveTo(18.41f, 9.11f, 18.75f, 9.45f, 18.75f, 9.86f)
                verticalLineTo(14.14f)
                close()
            }
        }.build()

        return _VoiceSquare!!
    }

@Suppress("ObjectPropertyName")
private var _VoiceSquare: ImageVector? = null
